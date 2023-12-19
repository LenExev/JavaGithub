package Stream.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarCollection {

    private static List<Car> cars;
    public static List<Car> getCars(int size) {
        cars = new ArrayList<>();
        for (int index = 0; index < size; index++) {
            cars.add(new Car(RundomCarName.randomName(),
                    RundomColor.randomName(),
                    RundomMaxSpeed.get()));
        }
        return cars;
    }
    private CarCollection(){}
}
