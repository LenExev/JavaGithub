package ExtendsClassesPackage.Animal;

import ExtendsClassesPackage.Animal.Animal;

public class Kangarro extends Animal {

    public Kangarro(String name, double weight){
        super.name=name;
        super.weight=weight;
    }

    @Override
    protected String go() {
        return "Я могу очень быстро прыгать";
    }

}
