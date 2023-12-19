package ExtendsClassesPackage.Human;

import ExtendsClassesPackage.Human.Human;

public class Sailor extends Human {

    public Sailor(String name) {
        super.name=name;
    }

    public String work(){
        return "Я продавец!";
    }
    public String getName() {
        return super.name;
    }

    public void setName(String name) {
        super.name=name;
    }
}

