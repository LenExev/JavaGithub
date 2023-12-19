package Stream.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RundomCarName {
    private static final List<String> carNames;

    static {
        carNames = new ArrayList<>();
        carNames.add("Audi");
        carNames.add("Mercedes");
        carNames.add("VW");
        carNames.add("Nissan");
        carNames.add("Opel");
        carNames.add("Ford");
        carNames.add("Toyota");
    }

    public static String randomName() {
        Random rand = new Random();
        int randSize = carNames.size();
        return carNames.get(rand.nextInt(randSize));
    }

    private RundomCarName() {}
}
