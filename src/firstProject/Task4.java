package firstProject;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("введите 6-значное число");

        boolean check=true;
        int number=0;

        Scanner scanner = new Scanner(System.in);
        do{
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();

                if (number / 1000000 > 0 || number / 100000 == 0) {
                    System.out.println("необходимо ввести 6-значное число");
                } else {
                    check = false;
                }
            }
            else{
                System.out.println("необходимо ввести 6-значное целое число");
                scanner.next();
            }
        }while(check);

        int number1= number/10000;
        int number2=number%100;
        int number3=number1/10;
        int number4=number1%10;
        int number5=number2/10;
        int number6=number2%10;
        int number7=number3 + number4*10;
        int number8=number5 + number6*10;
        int number9=number - number1*10000 - number2;
        int result=number8*10000 + number9 + number7;

        System.out.println("новое число:  ");
        System.out.print(result);
    }
}
