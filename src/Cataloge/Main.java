package Cataloge;

public class Main {
    public static void main(String[] args) {
        Book b = new Book("Gogol", "Vechera", "story", 780);
        b.print();
        Cataloge cat = new Cataloge();
        cat.addEditionToCataloge(b);
        cat.findByAuthor("Gogol");
    }
}