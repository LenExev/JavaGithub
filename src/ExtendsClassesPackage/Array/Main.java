package ExtendsClassesPackage.Array;

public class Main {
    public static void main(String[] args) {
        myArray arr=new myArray(20);
        arr.init(-5,15);
        System.out.println(arr);
        int number=0;
        number=arr.max();
        System.out.println("Макимальное значение массива: " + number);
        number=arr.min();
        System.out.println("Минимальное значение массива: " + number);
        float number2=arr.avg();
        System.out.println("Среднеарифметическое значение массива: " + number2);
        arr.sortAsc();
        System.out.println("сортировка по возрастанию " + arr);
        arr.sortDesc();
        System.out.println("сортировка по убыванию " + arr);
    }
}
