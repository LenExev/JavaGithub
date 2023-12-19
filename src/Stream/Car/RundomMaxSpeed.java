package Stream.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RundomMaxSpeed {

    public static int get() {
        Random rand = new Random();
        return rand.nextInt(150,200);
    }
    private RundomMaxSpeed() {}
}
