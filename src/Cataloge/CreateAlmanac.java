package Cataloge;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreateAlmanac {
    public String[] names={"Возрождение","Весна","Путешественник"};

    public List<Book> createBookslist(int number){
        List<Book> books=new ArrayList<>();
        for(int index=0; index<number; index++){
           CreateBook createBook=new CreateBook();
           Book book=createBook.create();
           books.add(book);
        }
        return books;
    }

    public Almanac create(){
        Random rand = new Random();
        return new Almanac(names[rand.nextInt(names.length)],createBookslist(rand.nextInt(2,5)));
    }
}
