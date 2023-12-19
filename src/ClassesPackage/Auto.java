package ClassesPackage;

import java.time.Year;
import java.util.Scanner;

public class Auto {
    private String name = "";
    private String production = "";
    private int year = 0;
    private int volume = 0;

    public Auto(String name) {
        this.name = name;
    }

    public Auto(String name, String production) {
        this.name = name;
        this.production = production;
    }

    public Auto(String name, String production, int year) {
        this.name = name;
        this.production = production;
        setYear(year);
    }

    public Auto(String name, String production, int year, int volume) {
        this.name = name;
        this.production = production;
        setYear(year);
        setVolume(volume);
    }

    public Auto() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public void setYear(int year) {
        if(year > 0 && year <= Year.now().getValue()) {
            this.year = year;
        } else{
            this.year = 0;
        }
    }

    public void setVolume(int volume) {
       if(volume>1000 ){
           this.volume=volume;
       } else{
           this.volume=0;
       }
    }

    public String getName() {
        return name;
    }

    public String getProduction() {
        return production;
    }

    public int getYear() {
        return year;
    }
    public int getVolume() {
        return volume;
    }

    public void putData(String name, String production, int year, int volume) {
        this.name = name;
        this.production = production;
        setYear(year);
       setVolume(volume);
    }
    public void putData(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите модель машины:");
        name=scanner.nextLine();

        System.out.println("Введите название производителя:");
        production = scanner.nextLine();

        putYear(scanner);
        putVolume(scanner);

    }
    private void putYear(Scanner scanner){
        System.out.println("Введите год выпуска машины:");
        boolean check=true;
        do{
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if(number > 0 && number <= Year.now().getValue()){
                    year = number;
                    check = false;
                }else{
                    System.out.println("Некорректный год");
                    scanner.nextLine();
                }
            }  else{
                System.out.println("Некорректный год");
                scanner.next();
            }
        }while(check);
    }
    private void putVolume(Scanner scanner){
        System.out.println("Введите объем двигателя:");
        boolean check2=true;
        do{
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if(number > 1000 ){
                    volume=number;
                    check2 = false;
                }else{
                    System.out.println("Некорректное число");
                    scanner.nextLine();
                }
            }  else{
                System.out.println("Некорректное число");
                scanner.next();
            }
        }while(check2);
    }
    @Override
    public String toString() {
        return "Auto{" +
                "name='" + name + '\'' +
                ", production='" + production + '\'' +
                ", year=" + year +
                ", volume=" + volume +
                '}';
    }
    public void print(){
        String outStr="";
        if( !getProduction().isEmpty()) {
            outStr += "производитель: " + getProduction() + "\n";
        }
        if( !getName().isEmpty()) {
            outStr += "модель автомобиля: " + getName() + "\n";
        }
        if( getYear() != 0) {
            outStr += "год: " + getYear() + "\n";
        }
        if( getVolume() != 0) {
            outStr += "объем двигателя: " + getVolume() + "куб.см" + "\n";
        }

        System.out.println(outStr);
    }

    public static void main(String[] args) {
        Auto auto=new Auto();
        auto.setName("Жук");
        auto.setProduction("Ниссан");
        auto.setYear(2014);
        auto.setVolume(1590);

        auto.print();

        Auto auto2 = new Auto();
        auto2.putData();
        auto2.print();
    }
}
