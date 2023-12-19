package firstProject;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("введите 1-ю цифру числа");

        Scanner scanner = new Scanner(System.in);
        int number1= scanner.nextInt();

        System.out.println("введите 2-ю цифру числа");
        int number2= scanner.nextInt();

        System.out.println("введите 3-ю цифру числа");
        int number3= scanner.nextInt();

        int result=number1*100 + number2*10 + number3;

        System.out.print("создано число  ");
        System.out.print(result);
    }
}
