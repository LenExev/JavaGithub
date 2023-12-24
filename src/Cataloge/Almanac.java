package Cataloge;

import java.io.Serializable;
import java.util.List;

public class Almanac implements Serializable, Edition {
    private String name;
    private List<Book> books;

    public Almanac(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }

    @Override
    public void print() {
        System.out.println("Almanac: name= "+name);
        System.out.println("***Books in almanac:");
        for(Book book:books){
            book.print();
        }
        System.out.println("***");
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }


}
