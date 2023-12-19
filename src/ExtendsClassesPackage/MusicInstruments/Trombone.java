package ExtendsClassesPackage.MusicInstruments;

import ExtendsClassesPackage.MusicInstruments.MusInstruments;

public class Trombone  extends MusInstruments {

    public Trombone(String name,String size) {
        super.name = name;
        super.size=size;
    }

    @Override
    public void show() {
        System.out.println(name+"\n\tPазмер: "+size);
    }

    @Override
    public void sound() {
        System.out.println("\tИздает звук, получающийся от колебания полного столба воздуха в инструменте.\n\tОсновной тон называется педальным звуком.");
    }

    @Override
    public void desc() {
        System.out.println("\tОписание:\n\t\tМедный духовой музыкальный инструмент, отличительной особенностью которого\n\t\tявляется наличие передвижной кулисы, вместо обычно используемых вентилей");
    }

    @Override
    public void history() {
        System.out.println("Появление тромбона относится к XV веку.\nПринято считать, что непосредственными предшественниками этого инструмента были кулисные трубы");
    }
}