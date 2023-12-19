package firstProject;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 
        Task12 {
    public static void main(String[] args) {

        int size = 10;
        int[] arrayFirst = new int[size];
        Random rand = new Random();

        for (int i = 0; i < arrayFirst.length; i++) {
            arrayFirst[i] =rand.nextInt(1,100);
        }
        System.out.println("создан массив случайных чисел:\n");
        System.out.println(Arrays.toString(arrayFirst));

        System.out.println("введите:\n\t1 - если хотите сортировавть массив по возрастанию\n\t2 - если хотите сортировавть массив по убыванию\n");

        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        int choise;

        do{
            if (scanner.hasNextInt()) {
                choise = scanner.nextInt();

                if(choise > 2 || choise < 1){

                    System.out.println("введите:\n\t1 - если хотите сортировавть массив по возрастанию\n\t2 - если хотите сортировавть массив по уьыванию\n");
                } else{

                    System.out.println();

                    if(choise == 1){

                        Arrays.sort(arrayFirst);
                        System.out.println("отсортированный массив по возрастанию:");
                        System.out.println(Arrays.toString(arrayFirst));
                    }
                    if(choise == 2){

                        Arrays.sort(arrayFirst);
                        int[] arraySecond = new int[size];
                        int j=0;
                        for (int i = arrayFirst.length-1; i >= 0; i--) {
                            arraySecond[j] =arrayFirst[i];
                            j++;
                        }
                        System.out.println("отсортированный массив по убыванию:");
                        System.out.println(Arrays.toString(arraySecond));
                    }
                    System.out.println();
                    check = false;
                }
            } else{
                System.out.println("некорректный ввод");
                scanner.next();
            }
        }while(check);
    }
}
