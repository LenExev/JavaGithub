package CarRace;

import java.util.Random;

import static java.lang.Thread.sleep;

public class RaceCarRunnable extends Car{
private int passed;
private int distance;
private boolean isFinish;
    public RaceCarRunnable(String name, int maxSpeed, int distance) {
        super(name, maxSpeed);
        this.distance=distance;
    }
    public int  getRandomSpeed(){
        Random rand = new Random();
        return rand.nextInt(super.maxSpeed/2, super.maxSpeed);
    }
    public void print(){
        System.out.println(super.name+"=> speed: "+getRandomSpeed()+"; progress: "+getPassed()+"/"+getDistance());
    }
@Override
public void run(){
    while(!isFinish){
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        passed = distance-getRandomSpeed();
        if(passed >= distance){
            isFinish = true;
        }
    }
}

    public int getPassed() {
        return passed;
    }

    public int getDistance() {
        return distance;
    }

}
