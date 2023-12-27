package Cataloge;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreateNewsPaper {
    public String[] names={"Голос Украіни","Порадниця","Публіка","Життя"};
    public List<String> createTittles(){
        List<String> tittles=new ArrayList<>();
        Random rand = new Random();
        for(int index = 1;index < rand.nextInt(5,9); index++){
          String str ="tittle"+index;
          tittles.add(str);
       }
       return tittles;
    }
    public String rundomDate(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        Random random = new Random();

        LocalDate startDate = LocalDate.of(2020, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 12, 31);

        long range = endDate.toEpochDay() - startDate.toEpochDay();

        long randomDay = startDate.toEpochDay() + random.nextLong() % range;

        LocalDate randomDate = LocalDate.ofEpochDay(randomDay);

        return randomDate.format(formatter);
    }
    public Newspaper create(){
        Random rand = new Random();
        return new Newspaper(names[rand.nextInt(names.length)], rundomDate(),createTittles());
    }
}
