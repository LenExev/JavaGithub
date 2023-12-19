package ExtendsClassesPackage.Facility;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Facility> list4= new ArrayList<>();
        Kettle kettle=new Kettle("Bosh","bs3000","1.8l","1200v");
        list4.add(kettle);
        Auto auto=new Auto("VW","Toureg","универсал","3.0 V6 TDI");
        list4.add(auto);
        Microwave micro =new Microwave("Sumsung","s200kn","30.l","1800v");
        list4.add(micro);
        Ship ship = new Ship("Katerina",280);
        list4.add(ship);
        for(var l:list4){
            l.show();
            l.sound();
            l.desc();
            System.out.println("-------");
        }
    }
}
