package Cataloge;

import java.util.ArrayList;
import java.util.Random;

public class CreateBook {
   public String[] autors={"Эрих Мария Ремарк","Агата Кристи","Тарас Шевченко","Марио Пьюзо"
            ,"Джейн Остен","Эдгар Аллан По","Артур Конан Дойл" };
    public String[] genres={"детектив","роман","биография","приключения","исторический"};
    public Book create(){
        Random rand = new Random();

        return new Book(autors[rand.nextInt(autors.length)],"name"+rand.nextInt(40),
                genres[rand.nextInt(genres.length)],rand.nextInt(40,2000));
    }
}
