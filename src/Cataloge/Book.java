package Cataloge;

public class Book {
    private String autor;
    private String name;
    private String genre;
    private int pages;

    public Book(String autor, String name, String genre, int pages) {
        this.autor = autor;
        this.name = name;
        this.genre = genre;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "autor='" + autor + '\'' +
                ", name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", pages=" + pages +
                '}';
    }

    public String getAutor() {
        return autor;
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

    public void setAutor(String autor) {
        this.autor = autor;
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
