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

        Student student1 = students.get(1);
        System.out.println("второй студент в списке: "+student1);

        List<String> youngStudents = students.stream()
                .filter(student -> student.getAge()<16)
                .map(Student::getFullName)
                .toList();

        System.out.println("Список студентов младше 16 лет: ");
        for(String name:youngStudents){
            System.out.println(name);
        }

        List<Student> students2 = StudentCollection.getStudents(100);
        double averageGrade = students2.stream()
                .mapToDouble(Student::getPoints)
                .average()
                .orElse(0.0);

        System.out.println("средний бал стедентов= "+averageGrade);

        List<Employee> employees = students.stream()
                .map(student -> {
                    String[] fullNameParts = student.getFullName().split(" ");
                    String name =fullNameParts.length > 1 ? fullNameParts[1] : "";
                    String surname = fullNameParts[0];
                    String patronymic = fullNameParts.length > 2 ? fullNameParts[2] : "";
                    return new Employee(name, surname, patronymic, student.getAge());
                })
                .collect(Collectors.toList());

        Employee employee = employees.get(1);
        System.out.println("второй работник в списке: "+employee);
    }
}
