package Stream.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RundomColor {
    private static final List<String> colors;

    static {
        colors = new ArrayList<>();
        colors.add("Black");
        colors.add("White");
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
    }

    public static String randomName() {
        Random rand = new Random();
        int randSize = colors.size();
        return colors.get(rand.nextInt(randSize));
    }

    private RundomColor() {}
}
