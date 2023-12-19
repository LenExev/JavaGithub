package firstProject;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        System.out.println("Введите символ, чтобы нарисовать линию");

        boolean check=true;
        int number=0;
        String symbol="";

        Scanner scanner = new Scanner(System.in);
        do{
            if (scanner.hasNextLine()) {

                symbol = scanner.nextLine();

                if(symbol.length() != 1 ){

                    System.out.println("Введите один символ");
                }else{

                    check = false;
                }
            }
            else{
                System.out.println("Некорректный ввод, введите символ");
                scanner.next();
            }
        }while(check);

        System.out.println("Введите количество символов от 1 до 40, чтобы нарисовать линию");

        check=true;
        do{
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();

                if (number < 0 || number > 40) {
                    System.out.println("необходимо ввести от 1 до 40");
                } else {
                    check = false;
                }
            }
            else{
                System.out.println("необходимо ввести от 1 до 40");
                scanner.next();
            }
        }while(check);

        System.out.println("введите:\n\t1 - если хотите нарисовать горизонтальную линию\n\t2 - если хотите нарисовать вертикальную линию\n");

        check=true;
        int choise=0;

        do{
            if (scanner.hasNextInt()) {
                choise = scanner.nextInt();
                if(choise > 2 || choise < 1){

                    System.out.println("введите:\n\t1 - если хотите нарисовать горизонтальную линию\n\t2 - если хотите нарисовать вертикальную линию\n");
                } else{

                    System.out.println();

                    if(choise == 1){

                       for(int i = 0; i < number; i++){
                           System.out.print(symbol);
                       }
                    }
                    if(choise == 2){

                        for(int i = 0; i < number; i++){
                            System.out.println(symbol);
                        }
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
