package ExtendsClassesPackage.Human;

import java.util.ArrayList;
import java.util.List;

public class Main  {
    public static void main(String[] args) {
        List<Human> list = new ArrayList<>();
        Builder builder= new Builder("Иван Иванов");
        list.add(builder);
        Sailor sailor=new Sailor("Петр Петров");
        list.add(sailor);
        Pilot pilot =new Pilot("Сергей Сергеев");
        list.add(pilot);
        for(var l:list){
            System.out.println(l.myName());
            System.out.println(l.work());
        }
    }
}
