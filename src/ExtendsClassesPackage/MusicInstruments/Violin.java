package ExtendsClassesPackage.MusicInstruments;

import ExtendsClassesPackage.MusicInstruments.MusInstruments;

public class Violin extends MusInstruments {

    public Violin(String name,String size) {
        super.name = name;
        super.size=size;
    }

    @Override
    public void show() {
        System.out.println(name+"\n\tPазмер: "+size);
    }

    @Override
    public void sound() {
        System.out.println("\tИздает высокий звук с помощью струн и смычка.");
    }

    @Override
    public void desc() {
        System.out.println("\tОписание:\n\t\tCмычковый музыкальный инструмент с четырьмя струнами");
    }

    @Override
    public void history() {
        System.out.println("Наиболее ранние изображения скрипок близкой к классической формы\nвстречаются в скульптурных композициях начала XVI века ");
    }
}
