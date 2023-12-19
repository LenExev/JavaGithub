package ExtendsClassesPackage.Human;

import ExtendsClassesPackage.Human.Human;

public class Builder extends Human {

    public Builder(String name) {
        super.name=name;

    }

    public String work(){
        return "Я строю дома!";
    }
    public String getName() {
        return super.name=name;
    }

    public void setName(String name) {
        super.name = name;
    }
}
