package ExtendsClassesPackage.Facility;

import ExtendsClassesPackage.Facility.Facility;

public class Ship extends Facility {
    private String production;
    private int numberOfPeople;
    public Ship(String name, int num) {
        super.name = name;
        numberOfPeople = Math.max(num,0);

    }

    @Override
    public void show() {
        System.out.println("Пароход");
    }

    @Override
    public void sound() {
        System.out.println("Я могу сигналить и хлюпает вода, когда я плыву");
    }

    @Override
    public void desc() {
        System.out.println("Название : " + name);
        System.out.println("Вместимость пассажиров: " + numberOfPeople + " человек");
    }
}
