package Cataloge;

import java.io.Serial;
import java.io.Serializable;

public class Book implements Serializable , Edition  {
    private String author;
    private String name;
    private String genre;
    private int pages;

    public Book(String author, String name, String genre, int pages) {
        this.author = author;
        this.name = name;
        this.genre = genre;
        this.pages = pages;
    }
    @Override
    public void print() {
        System.out.println( "Book:" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", pages=" + pages +
                ';');
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getPages() {
        return pages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }


}
