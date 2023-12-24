package Cataloge;

import java.io.Serializable;
import java.util.List;

public class Newspaper implements Serializable, Edition  {
    private String name;
    private String date;
    private List<String> capitals;

    public Newspaper(String name, String date, List<String> capitals) {
        this.name = name;
        this.date = date;
        this.capitals = capitals;
    }

    @Override
    public void print() {
        System.out.println("Newspaper name: "+name+", date='" + date);
        System.out.println("---capitals:");
        for(String cap:capitals){
            System.out.println(cap);
        }
        System.out.println("---");
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setCapitals(List<String> capitals) {
        this.capitals = capitals;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public List<String> getCapitals() {
        return capitals;
    }


}
