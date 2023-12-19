package Stream.Student;

public class Student {
    private String fullName;
    private int age;
    private int group;

    public Student(String fullName,  int group, int age) {
        this.fullName = fullName;
        this.age = age;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", group=" + group +
                '}';
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public int getGroup() {
        return group;
    }
}
