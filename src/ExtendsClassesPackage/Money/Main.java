package ExtendsClassesPackage.Money;

public class Main {
    public static void main(String[] args) {
        Product m=new Product("книга",3,30) ;
        m.print();
        m.upPrice(2.80);
        m.print();
        m.downPrice(4.875);
        m.print();
    }
}
