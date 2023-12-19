package ExtendsClassesPackage.MusicInstruments;

import ExtendsClassesPackage.MusicInstruments.MusInstruments;

public class Ukulele  extends MusInstruments {

    public Ukulele(String name,String size) {
        super.name = name;
        super.size=size;
    }

    @Override
    public void show() {
        System.out.println(name+"\n\tPазмер: "+size);
    }

    @Override
    public void sound() {
        System.out.println("\tИздает высокий звук с помощью струн и пальцев.");
    }

    @Override
    public void desc() {
        System.out.println("\tОписание:\n\t\tCтрунный музыкальный инструмент с четырьмя струнами, разновидность гитары");
    }

    @Override
    public void history() {
        System.out.println("Укулеле появилась на Гавайских островах во второй половине XIX века\nГавайцы используют для исполнения сентиментальных песен");
    }
}
