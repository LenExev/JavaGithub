package CarRace;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;

import static java.lang.Thread.sleep;

public class Race {
    public static AtomicLong startRaceTime;
    public static void main(String[] args) throws InterruptedException {

        Random random=new Random();
        int distance=1000;
        String[] names={"Audi","Mercedes","VW","Toyota","Volvo","Ford","Nissan","Opel"};

        int numberOfCar=random.nextInt(2, names.length);
        //int maxSpeed= random.nextInt(160,180);

        CountDownLatch latch = new CountDownLatch(numberOfCar);

        List<RaceCarRunnable> cars=new ArrayList<>();

         for(int index=0; index< numberOfCar;index++){
             cars.add(new RaceCarRunnable(names[index],maxSpeed(),distance,latch));
         }
//         cars.add(new RaceCarRunnable("Audi",160,distance,latch));
//         cars.add(new RaceCarRunnable("VW",160,distance,latch));
//         cars.add(new RaceCarRunnable("Toyota",160,distance,latch));

         List< Thread > carsRace=new ArrayList<>();
         for (var car:cars ) {
             carsRace.add(new Thread(car));
         }


        startRace(carsRace);
        try {
            latch.await();
            long minTime=findMinTime(cars);
            System.out.println("    ***********");
            for (var car:cars ) {
                if(minTime == car.getFinishTime()){
                    System.out.println(car.getName() + " WINNER! time in race = "+ Race.convertToTime(car.getFinishTime()) );
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
public static long findMinTime(List<RaceCarRunnable> cars){
    long minTime=cars.get(0).getFinishTime();
    for (var car:cars ) {
        if(minTime > car.getFinishTime()){
            minTime = car.getFinishTime();
        }
    }
    return minTime;
}
public static int maxSpeed(){
        Random random=new Random();
        return random.nextInt(160,180);
    }
    public static void  startRace(List<Thread> cars){

        startRaceTime = new AtomicLong(System.currentTimeMillis());
        Thread tr=  new Thread(new Runnable() {
            @Override
            public void run() {
                for(int index=3;index>=0;index--) {
                    try {
                        sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if(index!=0){
                        System.out.println(index+"...");
                    }
                    else{
                        System.out.println("Go!!!");
                    }
                }
                for (var car:cars ) {
                    car.start();
                }
            }
        });
        tr.start();
    }
    public static String convertToTime(long time) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("ss.SSS");
        dateFormat.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        Date date = new Date(time);

        return dateFormat.format(date)+" секунд";
    }
}
