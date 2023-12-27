package Cataloge;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Book b = new Book("Gogol", "Vechera", "story", 780);
//        b.print();
//        List<String> list= new ArrayList();
//        list.add("name1");
//        list.add("name2");
//        list.add("name3");
//        Newspaper newsp=new Newspaper("Dzerkalo","12/11/2023",list);
//        List<Book> listBook=new ArrayList<>();
//        listBook.add(b);
//        listBook.add(new Book("dfsf","fsfs","story",120));
//        Almanac alm=new Almanac("Crocodil",listBook);
//        Cataloge cat = new Cataloge();
//        cat.addEditionToCataloge(b);
//        cat.addEditionToCataloge(newsp);
//        cat.addEditionToCataloge(alm);
//        cat.printCataloge();
//        cat.findByAuthor("Gogol");
//        cat.findByName("Dzerkalo");
//        System.out.println("/".repeat(10));
//        CreateBook cr=new CreateBook();
//        Book b1=cr.create();
//        Book b2=cr.create();
//        Book b3=cr.create();
//        Book b4=cr.create();
//        Book b5=cr.create();
//        cat.addEditionToCataloge(b1);
//        cat.addEditionToCataloge(b2);
//        cat.addEditionToCataloge(b3);
//        cat.addEditionToCataloge(b4);
//        cat.addEditionToCataloge(b5);
//        CreateNewsPaper crNP=new CreateNewsPaper();
//        Newspaper np1 = crNP.create();
//        Newspaper np2 = crNP.create();
//        Newspaper np3 = crNP.create();
//        cat.addEditionToCataloge(np1);
//        cat.addEditionToCataloge(np2);
//        cat.addEditionToCataloge(np3);
//
//        CreateAlmanac crAl=new CreateAlmanac();
//        Almanac alm1=crAl.create();
//        cat.addEditionToCataloge(alm1);
//        cat.printCataloge();

       CreateCataloge createCataloge=new CreateCataloge();
       Cataloge cataloge=createCataloge.create(4,3,1);
       cataloge.printCataloge();
SerializeCataloge serCat=new SerializeCataloge();
        serCat.serializeObjects(".cataloge.ser", cataloge);

        // Восстанавливаем объекты из файла
     //  Cataloge restoredCataloge = deserializeObjects("people.ser");

    }
}