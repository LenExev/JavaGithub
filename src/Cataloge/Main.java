package Cataloge;

public class Main {
    public static void main(String[] args) {

        CreateCataloge createCataloge=new CreateCataloge();
        Cataloge cataloge=createCataloge.create(4,3,1);
        cataloge.printCataloge();
        System.out.println("/".repeat(20));
        cataloge.findByName("Порадниця");
        System.out.println("/".repeat(10));
        cataloge.findByAuthor("Марио Пьюзо");
        System.out.println("/".repeat(10));
        cataloge.findByAuthor("Агата Кристи");
        System.out.println("/".repeat(10));
        cataloge.findByAuthor("Эрих Мария Ремарк");
        System.out.println("/".repeat(20));
        cataloge.saveCataloge();
        Cataloge restoredCataloge=cataloge.reconstructCataloge();
        System.out.println("[][][][][][]][][]");
        restoredCataloge.printCataloge();
    }
}