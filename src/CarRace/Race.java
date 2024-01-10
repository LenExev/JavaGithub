package CarRace;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;

import static java.lang.Thread.sleep;

public class Race {
    public static AtomicLong startRaceTime;
    public static void main(String[] args) throws InterruptedException {

        int distance=1000;

        int numberOfCar=3;

        CountDownLatch latch = new CountDownLatch(numberOfCar);
         List<RaceCarRunnable> cars=new ArrayList<>();

         cars.add(new RaceCarRunnable("Audi",160,distance,latch));
         cars.add(new RaceCarRunnable("VW",160,distance,latch));
         cars.add(new RaceCarRunnable("Toyota",160,distance,latch));

         List< Thread > carsRace=new ArrayList<>();
         for (var car:cars ) {
             carsRace.add(new Thread(car));
         }


        startRace(carsRace);
        try {
            latch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
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
