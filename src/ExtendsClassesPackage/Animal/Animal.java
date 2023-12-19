package ExtendsClassesPackage.Animal;

public abstract class Animal {
    protected String name;
    protected double weight;

    protected  abstract String go();
    public void print(){
        System.out.println(name + ": " + go());
        System.out.println("мой вес: " + weight);
    }
}
