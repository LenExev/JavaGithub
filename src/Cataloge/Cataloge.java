package Cataloge;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cataloge implements Serializable {
    private List<Edition> editions;

    public Cataloge() {
        editions = new ArrayList<Edition>();
    }
    public void addEditionToCataloge(Edition edition){
        editions.add(edition);
    }
    public void printCataloge(){
        for(Edition edit:editions){
            edit.print();
        }
    }
    public void findByName(String name){
        System.out.println("^^^Found by name:");
        for (Edition edit:editions ) {
           if(edit instanceof Book || edit instanceof Newspaper){
               if(Objects.equals(edit.getName(), name)){
                   edit.print();
               }
           }
           if(edit instanceof Almanac){
               for(Book book:((Almanac) edit).getBooks()){
                   if(Objects.equals(book.getName(), name)){
                       System.out.println("^^^Found by name in Almanac: name="+ edit.getName());
                       book.print();
                   }
               }
           }
        }
        System.out.println("^^^");
    }
    public void findByAuthor(String author){
        System.out.println("+++Found by author:");
        for (Edition edit:editions ) {
            if(edit instanceof Book ){
                if(Objects.equals(edit.getName(), author)){
                    edit.print();
                }
            }
            if(edit instanceof Almanac){
                for(Book book:((Almanac) edit).getBooks()){
                    if(Objects.equals(book.getName(), author)){
                        System.out.println("+++Found by author in Almanac: name="+ edit.getName());
                        book.print();
                    }
                }
            }
        }
        System.out.println("+++");
    }
}
