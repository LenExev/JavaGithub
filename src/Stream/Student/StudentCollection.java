package Stream.Student;

import Stream.Car.Car;
import Stream.Car.RundomCarName;
import Stream.Car.RundomColor;
import Stream.Car.RundomMaxSpeed;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentCollection {
    private static List<Student> students;
    public static List<Student> getStudents(int size) {
        Random rand = new Random();
        students = new ArrayList<>();
        for (int index = 0; index < size; index++) {
            students.add(new Student("name"+index,
                            rand.nextInt(5),
                    rand.nextInt(14,50)));
        }
        return students;
    }
    private StudentCollection(){}
}
