package ExtendsClassesPackage.Facility;

import ExtendsClassesPackage.Facility.Facility;

public class Kettle extends Facility {
    private String production;
    private String power;
    private String volume;
    public Kettle(String prod,String name, String vol, String pow) {
        super.name = name;
        power = pow;
        volume = vol;
        production=prod;
    }

    @Override
    public void show() {
        System.out.println("Чайник");
    }

    @Override
    public void sound() {
        System.out.println("Я буду свистеть когда вода закипит");
    }

    @Override
    public void desc() {
        System.out.println("Производитель: " + production);
        System.out.println("Модель: " + name);
        System.out.println("Объем воды: " + volume);
        System.out.println("Мощность: " + power);
    }
}
