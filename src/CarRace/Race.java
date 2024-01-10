package CarRace;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

public class Race {
    public static void main(String[] args) {
        System.out.println("Hello");
         int distance=1000;

         List<RaceCarRunnable> cars=new ArrayList<>();

         cars.add(new RaceCarRunnable("audi",160,distance));
         cars.add(new RaceCarRunnable("vw",160,distance));
         cars.add(new RaceCarRunnable("toyota",160,distance));

         List< Thread > carsRace=new ArrayList<>();
         for (var car:cars ) {
             carsRace.add(new Thread(car));
         }

        startRace(carsRace);
        System.out.println("End");
    }

    public static void  startRace(List<Thread> cars){
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

}
