package ExtendsClassesPackage.Money;

import ExtendsClassesPackage.Money.Money;

public class Product extends Money {
     private String name = "";
    public Product(String name,int dollars, int cents) {
        super(dollars, cents);
        this.name=name;
    }

    public Product() {
        super(0, 0);
    }

    public void upPrice(double price){
        int n1= (int) price;
        super.setDollars(super.getDollars() + n1);
       double n2= price-n1;
       n2=(Math.round(n2 * 100) );
        n1= (int) n2;
        super.setCents(super.getCents() + n1);
    }
    public void downPrice(double price){
        int n1= (int) price;
        super.setDollars(super.getDollars() - n1);
        double n2= price-n1;
        n2=(Math.round(n2 * 100) );
        n1= (int) n2;
        if(super.getCents() >= n1) {
            super.setCents(super.getCents() - n1);
        } else{
            if(super.getDollars()==0){
                super.setCents(0);
            } else {
                super.setDollars(super.getDollars() - 1);
                super.setCents(100 + super.getCents() - n1);
            }
        }
    }
    public void print(){
        System.out.print(name+" цена: ");
        super.display();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getDollars() {
        return super.getDollars();
    }

    public void setDollars(int dollars) {
        super.setDollars(dollars);
    }
    public void setCents(int cents) {
        super.setCents(cents);
    }
    public int getCents() {
        return super.getCents();
    }

}
