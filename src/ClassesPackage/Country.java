package ClassesPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Country {
    private String countryName="";
    private String continentName ="";
    private String capital ="";
    private String phoneCode ="";
    private String numberOfCitizen ="";
    private List<String> cities = new ArrayList<>();
    public Country(){ }
    public Country(String country, String continent, String capital, String number, String phoneCode, String[] cit){
        countryName=country;
        continentName=continent;
        numberOfCitizen=number;
        this.capital=capital;
        this.phoneCode=phoneCode;
        for(var c:cit){
            cities.add(c);
        }
    }
    public Country(String country, String continent, String capital, String number, String phoneCode){
        countryName=country;
        continentName=continent;
        numberOfCitizen=number;
        this.capital=capital;
        this.phoneCode=phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public Country(String country, String continent, String capital){
        countryName=country;
        continentName=continent;
        this.capital=capital;
    }
    public Country(String country,String capital){
        countryName=country;
        this.capital=capital;
    }
    public Country(String country){
        countryName=country;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getContinentName() {
        return continentName;
    }

    public String getCapital() {
        return capital;
    }

    public String getNumberOfCitizen() {
        return numberOfCitizen;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public List<String> getCities() {
        return cities;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setNumberOfCitizen(String numberOfCitizen) {
        this.numberOfCitizen = numberOfCitizen;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }
    public void addCity(String name){
        this.cities.add(name);
    }
    public void deleteCity(String name){
        this.cities.remove(name);
    }

    public void putData(String country, String continent, String capital, String number, String phoneCode,String[] cit){
        countryName=country;
        continentName=continent;
        numberOfCitizen=number;
        this.capital=capital;
        this.phoneCode=phoneCode;
        for(var c:cit){
            cities.add(c);
        }
    }
        public void putCitiesToCountry(){
            Scanner scanner = new Scanner(System.in);
            boolean check=true;
            while(check){
                System.out.println("Введите название города:");
                cities.add(scanner.nextLine());
                System.out.println("Продолжить вводить города? (нажмите Y  если да)");
                String chose =scanner.nextLine();
                if (!chose.toLowerCase().equals("y")){
                    check = false;
                }

            }

    }
    public void putData(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название страны:");
        countryName=scanner.nextLine();

        System.out.println("Введите название континента:");
        continentName=scanner.nextLine();

        System.out.println("Введите название столицы:");
        capital=scanner.nextLine();

        System.out.println("Введите численность населения:");
        numberOfCitizen = scanner.nextLine();

        System.out.println("Введите телефонный код страны:");
        phoneCode = scanner.nextLine();

    }
    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", continentName='" + continentName + '\'' +
                ", capital='" + capital + '\'' +
                ", phoneCode='" + phoneCode + '\'' +
                ", numberOfCitizen='" + numberOfCitizen + '\'' +
                ", cities=" + cities +
                '}';
    }

    public void print(){
        String outStr="";
        if( !getCountryName().isEmpty()) {
             outStr += "страна: " + getCountryName() + "\n";
        }
        if( !getContinentName().isEmpty()) {
            outStr += "континент: " + getContinentName() + "\n";
        }
        if( !getCapital().isEmpty()) {
            outStr += "столица: " + getCapital() + "\n";
        }
        if( !getNumberOfCitizen().isEmpty()) {
            outStr += "количество жителей: " + getNumberOfCitizen() + "\n";
        }
        if( !getPhoneCode().isEmpty()) {
            outStr += "телефонный код: " + getPhoneCode() + "\n";
        }
        if( !cities.isEmpty()) {
            outStr += "города: " + "\n";;
            for (String city : cities ) {
                outStr += "\t\t" + city + "\n";
            }
        }
        System.out.println(outStr);
    }

    public static void main(String[] args) {

        Country country=new Country("Украина");
        country.setContinentName("Евразия");
        country.setCapital("Киев");
        country.setPhoneCode("+380");
        country.addCity("Винница");
        country.addCity("Львов");
        country.addCity("Харьков");
        country.addCity("Варшава");
        country.addCity("Одесса");
        country.addCity("Херсон");
        country.addCity("Житомир");
        country.setNumberOfCitizen("43.79 млн");

        country.deleteCity("Варшава");
        country.print();

        Country country1=new Country("Польша","Евразия","Варшава","37,75 млн","+48");
        country1.print();

        Country country2=new Country();
        country2.putData();
        country2.putCitiesToCountry();
        country2.print();
    }
}
