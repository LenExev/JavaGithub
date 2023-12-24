package Stream.Student;

public class Student {
    private String fullName;
    private int age;
    private int group;
    private int points;
    public Student(String fullName,  int group, int age,int points) {
        this.fullName = fullName;
        this.age = age;
        this.group = group;
        this.points=points;
    }

    public int getPoints() {
        return points;
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
