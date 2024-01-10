package CarRace;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

import static CarRace.Race.startRaceTime;
import static java.lang.Thread.activeCount;
import static java.lang.Thread.sleep;

public class RaceCarRunnable extends Car{
private int passed;
private int distance;
private long finishTime;
protected CountDownLatch latch;
private boolean isFinish;
    public RaceCarRunnable(String name, int maxSpeed, int distance,CountDownLatch latch) {
        super(name, maxSpeed);
        this.distance=distance;
        passed = 0;
        this.latch=latch;
    }
    public int  getRandomSpeed(){
        Random rand = new Random();
        return rand.nextInt(super.maxSpeed/2, super.maxSpeed);
    }
    public void print(){
        System.out.println(super.name+" => speed: "+getRandomSpeed()+"; progress: "+getPassed()+"/"+getDistance());
    }
@Override
public void run(){
    while(!isFinish){
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        passed += getRandomSpeed();
        if(passed >= distance){
            passed=distance;
            isFinish = true;
            latch.countDown();
           finishTime=  System.currentTimeMillis() - Race.startRaceTime.get() ;
            System.out.println(name + " FINISHED! time in race = "+ Race.convertToTime(finishTime));
            return;
        }
        print();
    }
}

    public long getFinishTime() {
        return finishTime;
    }

    public int getPassed() {
        return passed;
    }

    public int getDistance() {
        return distance;
    }

}
