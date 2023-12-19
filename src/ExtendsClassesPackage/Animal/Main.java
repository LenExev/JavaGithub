package ExtendsClassesPackage.Animal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("************************");
        List<Animal> list2 = new ArrayList<>();
        Crocodile croc= new Crocodile("Крокодил", 480);
        list2.add(croc);
        Tiger tiger=new Tiger("Тигр", 120);
        list2.add(tiger);
        Kangarro kang =new Kangarro("Кенгуру",38.5);
        list2.add(kang);
        for(var l:list2){
            l.print();
        }

    }
}
