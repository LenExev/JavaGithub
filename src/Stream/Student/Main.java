package Stream.Student;

import Stream.Car.Car;
import Stream.Car.CarCollection;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = StudentCollection.getStudents(100);

        Student student1 = students.get(2);
        System.out.println(student1);

        List<String> youngStudents = students.stream()
                .filter(student -> student.getAge()<16)
                .map(Student::getFullName)
                .toList();

        for(String name:youngStudents){
            System.out.println(name);
        }
    }
}
