package firstProject;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("введите число месяца от 1 до 12");

        boolean check=true;
        int number=1;

        Scanner scanner = new Scanner(System.in);
        do{
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();

                if (number < 1 || number > 12) {
                    System.out.println("необходимо ввести число от 1 до 12");
                } else {
                    check = false;
                }
            }
            else{
                System.out.println("некорректный ввод");
                scanner.next();
            }
        }while(check);

        if((number >= 1 && number <= 2) || number == 12){
            System.out.println("зима");
        }
        if(number >= 3 && number <= 5 ){
            System.out.println("весна");
        }
        if(number >= 6 && number <= 8){
            System.out.println("лето");
        }
        if(number >= 9 && number <= 11 ){
            System.out.println("осень");
        }
    }
}
