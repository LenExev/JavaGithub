package ExtendsClassesPackage.Human;

import ExtendsClassesPackage.Human.Human;

public class Pilot extends Human {

    public Pilot(String name) {
        super.name=name;
    }

    public Pilot() {
    }
    public String work(){
        return "Я управляю самолетом!";
    }
    public String getName() {
        return super.name;
    }

    public void setName(String name) {
        super.name=name;
    }


}
