package firstProject;

import java.util.Random;

public class Task10 {
    public static void main(String[] args) {

        int size = 20;
        int[] arrayFirst = new int[size];
        int number=0;

        Random rand = new Random();

        for (int i = 0; i < arrayFirst.length; i++) {
            arrayFirst[i] =rand.nextInt(-9,10);
        }

        System.out.println("создан массив случайных чисел:\n");
        for (int j : arrayFirst) {
            System.out.print(j + " \t");
        }
        System.out.println("\n");

        for (int i : arrayFirst) {
            if ( i > 0) {
                number++;
            }
        }

        if(number > 0){
           int[] arrayPositivNumbers = new int[number];

           int i=0;
           for (int index = 0; index < arrayFirst.length; index++) {
               if(arrayFirst[index] > 0){
                   arrayPositivNumbers[i]=arrayFirst[index];
                   i++;
              }
           }
            System.out.println("создан массив положительных чисел из начального массива:\n");
            for (int j : arrayPositivNumbers) {
                System.out.print(j + " \t");
            }
            System.out.println("\n");

        }else{
            System.out.println("В начальном массиве нет положительных чисел");
        }

        number=0;
        for (int i : arrayFirst) {
            if ( i < 0) {
                number++;
            }
        }

        if(number > 0){
            int[] arrayNegativNumbers = new int[number];

            int i=0;
            for (int index = 0; index < arrayFirst.length; index++) {
                if(arrayFirst[index] < 0){
                    arrayNegativNumbers[i]=arrayFirst[index];
                    i++;
                }
            }
            System.out.println("создан массив отрицательных чисел из начального массива:\n");
            for (int j : arrayNegativNumbers) {
                System.out.print(j + " \t");
            }
            System.out.println("\n");

        }else{
            System.out.println("В начальном массиве нет отрицательных чисел");
        }

        number=0;
        for (int i : arrayFirst) {
            if ( i % 2 == 0) {
                number++;
            }
        }

        if(number > 0){
            int[] arrayEvenNumbers = new int[number];

            int i=0;
            for (int index = 0; index < arrayFirst.length; index++) {
                if(arrayFirst[index] % 2 == 0){
                    arrayEvenNumbers[i]=arrayFirst[index];
                    i++;
                }
            }
            System.out.println("создан массив четных чисел из начального массива:\n");
            for (int j : arrayEvenNumbers) {
                System.out.print(j + " \t");
            }
            System.out.println("\n");

        }else{
            System.out.println("В начальном массиве нет четных чисел");
        }

        number=0;
        for (int i : arrayFirst) {
            if ( i % 2 != 0) {
                number++;
            }
        }

        if(number > 0){
            int[] arrayOddNumbers = new int[number];

            int i=0;
            for (int index = 0; index < arrayFirst.length; index++) {
                if(arrayFirst[index] % 2 != 0){
                    arrayOddNumbers[i]=arrayFirst[index];
                    i++;
                }
            }
            System.out.println("создан массив нечетных чисел из начального массива:\n");
            for (int j : arrayOddNumbers) {
                System.out.print(j + " \t");
            }
            System.out.println("\n");

        }else{
            System.out.println("В начальном массиве нет нечетных чисел");
        }
    }
}
