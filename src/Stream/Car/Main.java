package Stream.Car;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        List<Car> cars = CarCollection.getCars(100);
        Car car1 = cars.get(2);
        System.out.println(car1.toString());

        Optional<Car> fastestRedCar = cars.stream()
                .filter(car -> "Red".equals(car.getColor()))
                .max(Comparator.comparingInt(Car::getMaxSpeed));

         fastestRedCar.ifPresent(car -> System.out.println("Самая быстрая красная машина: " + car));

    }
}
