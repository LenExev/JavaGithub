package ExtendsClassesPackage.Human;

public abstract class Human {
    protected String name;
     protected abstract String work();
     protected  String myName(){
         return " Меня зовут  " + name;
     }
}
