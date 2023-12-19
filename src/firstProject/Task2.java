package firstProject;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Task2 {

    public static void main(String[] args) {
        System.out.println("введите число из которого хотите вычислить процент");

        Scanner scanner = new Scanner(System.in);
        int number= scanner.nextInt();

        System.out.println("введите % вычисления из числа");
        double percent= scanner.nextDouble();

        double result=number*percent/100;

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String formattedNumber = decimalFormat.format(result);

        System.out.print("результат= ");
        System.out.print(formattedNumber);
    }
}
