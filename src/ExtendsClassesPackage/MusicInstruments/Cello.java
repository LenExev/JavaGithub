package ExtendsClassesPackage.MusicInstruments;

import ExtendsClassesPackage.MusicInstruments.MusInstruments;

public class Cello  extends MusInstruments {

    public Cello(String name,String size) {
        super.name = name;
        super.size=size;
    }

    @Override
    public void show() {
        System.out.println(name+"\n\tPазмер: "+size);
    }

    @Override
    public void sound() {
        System.out.println("\tИздает низкий звук с помощью струн и смычка.");
    }

    @Override
    public void desc() {
        System.out.println("\tОписание:\n\t\tCмычковый музыкальный инструмент с четырьмя струнами, струны толще, чем у скрипки");
    }

    @Override
    public void history() {
        System.out.println("Появление виолончели относится к началу XVI века.\nПервоначально она применялась как басовый инструмент для сопровождения пения ");
    }
}
