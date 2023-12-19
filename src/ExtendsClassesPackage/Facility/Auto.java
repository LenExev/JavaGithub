package ExtendsClassesPackage.Facility;

import ExtendsClassesPackage.Facility.Facility;

public class Auto extends Facility {

    private String production;
    private String  type;
    private String volume;
    public Auto(String prod,String name, String type, String vol) {
        super.name = name;
        this.type = type;
        volume = vol;
        production=prod;
    }

    @Override
    public void show() {
        System.out.println("Автомобиль");
    }

    @Override
    public void sound() {
        System.out.println("Я могу сигналить и у меня красиво поет двигатель");
    }

    @Override
    public void desc() {
        System.out.println("Производитель: " + production);
        System.out.println("Модель: " + name);
        System.out.println("Объем двигателя: " + volume);
        System.out.println("Тип кузова: " + type);
    }
}
