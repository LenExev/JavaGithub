package firstProject;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("Введите два числа от 1 до 10 и увидите  таблицу умнажения в диапазоне между ними.");
        System.out.println("Введите первое  число диапазона:");

        boolean check=true;
        int number1=0;
        int number2=0;

        Scanner scanner = new Scanner(System.in);
        do{
            if (scanner.hasNextInt()) {
                number1 = scanner.nextInt();
                if(number1 < 1 || number1 > 10){
                    System.out.println("Вводите числа от 1 до 10, введите первое число");
                }else{
                check = false;
                }
            }
            else{
                System.out.println("Некорректный ввод, введите первое число");
                scanner.next();
            }
        }while(check);

        System.out.println("Введите второе  число диапазона:");

        check=true;

        do{
            if (scanner.hasNextInt()) {
                number2 = scanner.nextInt();
                if(number2 < 1 || number2 > 10){
                    System.out.println("Вводите числа от 1 до 10, введите второе число");
                }else{
                    check = false;
                }
            }
            else{
                System.out.println("Некорректный ввод, введите второе число");
                scanner.next();
            }
        }while(check);

        if(number1 > number2){
            int num=number2;
            number2=number1;
            number1=num;
        }

        for(int i = number1; i <= number2; i++){
            for(int i1 = 1; i1 <= 10; i1++){
                int result = i * i1;
                System.out.print("(" + i + " * "+ i1 + ") = " + result +" \t");
            }
            System.out.println("\n_______________________________________________________________________________________________________________________________________________________________");
        }
    }
}
