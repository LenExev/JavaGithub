package firstProject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("введите количество метров");

        boolean check=true;
       double meters=0;
      double result=0;

        Scanner scanner = new Scanner(System.in);
        do{
            if (scanner.hasNextDouble()) {
                meters = scanner.nextDouble();
                check = false;
             } else{
                System.out.println("некорректный ввод");
                scanner.next();
            }
        }while(check);

        System.out.println("введите:\n\t1 - если хотите перевести в мили\n\t2 - если хотите перевести в дюймы\n\t3 - если хотите перевести в ярды\n");

        check=true;
        int choise=0;
        do{
            if (scanner.hasNextInt()) {
                choise = scanner.nextInt();
                if(choise > 3 || choise < 1){
                    System.out.println("введите:\n\t1 - если хотите перевести в мили\n\t2 - если хотите перевести в дюймы\n\t3 - если хотите перевести в ярды\n");
                } else{

                    DecimalFormat decimalFormat = new DecimalFormat("0.000");

                   if(choise == 1){
                       result = meters * 0.000621371;
                       System.out.print(meters);
                       System.out.print(" метров = ");
                       System.out.print(decimalFormat.format(result));
                       System.out.print(" милей");
                   }
                    if(choise == 2){
                        result = meters * 39.3701;
                        System.out.print(meters);
                        System.out.print(" метров = ");
                        System.out.print(decimalFormat.format(result));
                        System.out.print(" дюймов");
                    }
                    if(choise == 3){
                        result = meters * 1.09361;
                        System.out.print(meters);
                        System.out.print(" метров = ");
                        System.out.print(decimalFormat.format(result));
                        System.out.print(" ярдов");
                    }
                    check = false;
                }
            } else{
                System.out.println("некорректный ввод");
                scanner.next();
            }
        }while(check);
    }
}
