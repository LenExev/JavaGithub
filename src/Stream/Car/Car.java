package Stream.Car;

import java.time.format.SignStyle;

public class Car {
    private String name;
    private String color;
    private int maxSpeed;

    public Car(String name, String color, int maxSpeed) {
        this.name = name;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{ " +
                 name + '(' +
                 color + ')' +
                ", maxSpeed=" + maxSpeed +"km/hour"+
                '}';
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
