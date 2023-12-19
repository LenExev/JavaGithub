package ExtendsClassesPackage.MusicInstruments;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MusInstruments> list3= new ArrayList<>();
        Violin violin= new Violin("Скрипка","31.75 - 35,5 см");
        list3.add(violin);
        Cello cello= new Cello("Виолончель","51.0 - 69.5 см");
        list3.add(cello);
        Ukulele ukulele= new Ukulele("Укулеле","33.0 - 53 см");
        list3.add(ukulele);
        Trombone trombone = new Trombone("Тромбон"," 94x31x29 см");
        list3.add(trombone);
        for(var l:list3) {
            l.show();
            l.desc();
            l.sound();
            l.history();
            System.out.println("-------");
        }
    }
}
