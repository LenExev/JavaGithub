package Collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class User {
    private String name;
    private int age;
    private String phone;

    public User(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name) && Objects.equals(phone, user.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, phone);
    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        User user = (User) o;
//        return Objects.equals(name, user.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name);
//    }

    public static void main(String[] args) {
        User user1=new User("Ivanov", 25,"(097)1234567")  ;
        User user2=new User("Ivanov", 25,"(097)1234567")  ;
        User user3=new User("Ivanov", 35,"(097)1234567")  ;
        Set<User> userSet= new HashSet<>();
        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);
        for (User user: userSet  ) {
            System.out.println(user);
        }

    }
}
