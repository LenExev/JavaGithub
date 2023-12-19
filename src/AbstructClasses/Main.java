package AbstructClasses;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Figure> list=new ArrayList<Figure>();
        Rectangle rect = new Rectangle(5,7);
        list.add(rect);
        Circle circle= new Circle(3);
        list.add(circle);
        Trangle treangle=new Trangle(3,7);
        list.add(treangle);
        Trapeze trapez=new Trapeze(2,3,1);
        list.add(trapez);
        for(var l:list){
        System.out.println(l.countSquare());
        }
    }
}
