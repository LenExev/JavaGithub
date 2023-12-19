package firstProject;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        System.out.println("Введите два числа и увидите все нечетные числа в диапазоне между ними.");
        System.out.println("Введите первое  число диапазона:");

        boolean check=true;
        int number1=0;
        int number2=0;

        Scanner scanner = new Scanner(System.in);
        do{
            if (scanner.hasNextInt()) {
                number1 = scanner.nextInt();
                    check = false;
            }
            else{
                System.out.println("Необходимо ввести целое число");
                scanner.next();
            }
        }while(check);

        System.out.println("Введите второе  число диапазона:");

        check=true;

        do{
            if (scanner.hasNextInt()) {
                number2 = scanner.nextInt();
                check = false;
            }
            else{
                System.out.println("Необходимо ввести целое число");
                scanner.next();
            }
        }while(check);

        if(number1>number2){
            int num=number2;
            number2=number1;
            number1=num;
        }
        System.out.print("Нечетные числа в диапазоне от ");
        System.out.print(number1);
        System.out.print(" до ");
        System.out.print(number2);
        System.out.println(":");
        for(int i=number1;i<=number2;i++){
            if(i %2 != 0){
                System.out.println(i);
            }
        }
    }
}
