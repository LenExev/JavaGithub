package ExtendsClassesPackage.Animal;

import ExtendsClassesPackage.Animal.Animal;

public class Tiger extends Animal {

    public Tiger(String name, double weight){
        super.name=name;
        super.weight=weight;
    }

    @Override
    protected String go() {
        return "Я могу быстро бегать";
    }

}