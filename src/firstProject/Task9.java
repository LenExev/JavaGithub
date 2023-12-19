package firstProject;
import java.util.Arrays;
import java.util.Random;
public class Task9 {
    public static void main(String[] args) {

        int size = 10;
        int[] arrayFirst = new int[size];
        Random rand = new Random();

        for (int i = 0; i < arrayFirst.length; i++) {
            arrayFirst[i] =rand.nextInt(-3,4);
        }

        System.out.println("создан массив случайных чисел:\n");

        for (int j : arrayFirst) {
            System.out.print(j + " \t");
        }
        System.out.println("\n");

        int number=arrayFirst[0];
        for (int i : arrayFirst) {
            if (number > i) {
                number = i;
            }
        }
        System.out.println("Минимальное значение массива:  "+ number);

        number=arrayFirst[0];
        for (int i : arrayFirst) {
            if (number < i) {
                number = i;
            }
        }

        System.out.println("Максимальное значение массива:  "+ number);

        number=0;
        for (int i : arrayFirst) {
            if (i < 0) {
                number++;
            }
        }
        System.out.println("Количество отрицательных значений в массиве:  "+ number);

        number=0;
        for (int index = 0; index < arrayFirst.length; index++) {
            if(arrayFirst[index] > 0){
                number++;
            }
        }
        System.out.println("Количество положительных значений в массиве:  "+ number);

        number=0;
        for (int index = 0; index < arrayFirst.length; index++) {
            if(arrayFirst[index] == 0){
                number++;
            }
        }
        System.out.println("Количество значений равных 0 в массиве:  "+ number);

    }
}
