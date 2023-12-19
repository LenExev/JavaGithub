package ExtendsClassesPackage.Facility;

import ExtendsClassesPackage.Facility.Facility;

public class Microwave extends Facility {
    private String production;
    private String power;
    private String volume;
    public Microwave(String prod,String name, String vol, String pow) {
        super.name = name;
        power = pow;
        volume = vol;
        production=prod;
    }

    @Override
    public void show() {
        System.out.println("Микроволновка");
    }

    @Override
    public void sound() {
        System.out.println("Я жужжу когда грею еду");
    }

    @Override
    public void desc() {
        System.out.println("Производитель: " + production);
        System.out.println("Модель: " + name);
        System.out.println("Вместимость(объм): " + volume);
        System.out.println("Мощность: " + power);
    }
}
