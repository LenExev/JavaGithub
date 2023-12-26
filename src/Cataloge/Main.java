package Cataloge;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book b = new Book("Gogol", "Vechera", "story", 780);
        b.print();
        List<String> list= new ArrayList();
        list.add("name1");
        list.add("name2");
        list.add("name3");
        Newspaper newsp=new Newspaper("Dzerkalo","12/11/2023",list);
        List<Book> listBook=new ArrayList<>();
        listBook.add(b);
        listBook.add(new Book("dfsf","fsfs","story",120));
        Almanac alm=new Almanac("Crocodil",listBook);
        Cataloge cat = new Cataloge();
        cat.addEditionToCataloge(b);
        cat.addEditionToCataloge(newsp);
        cat.addEditionToCataloge(alm);
        cat.printCataloge();
        cat.findByAuthor("Gogol");
    }
}