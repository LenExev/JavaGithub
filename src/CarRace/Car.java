package CarRace;

public class Car implements Runnable{
    protected String name;
    protected int maxSpeed;

    public Car(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public void run() {

    }
}
