package Functions;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.function.BinaryOperator;

public class Main {

    interface Summa {
        double summa(double a, double b,double c);
    }
    interface Time {
        void time(String str);
    }


    public static void main(String[] args) {
        Summa summ=(a, b,c) -> a + b + c;
        double result =summ.summa(3,5,7);
        System.out.println("Результат сложения трех чисел: " + result);

        Summa summ1 = (a, b,c) -> a * b * c;
         result = summ1.summa(3, 5, 7);
        System.out.println("Результат умножения трех чисел: " + result);

        Time time=(str)-> System.out.println(str);
          time.time("время:  "+LocalTime.now());
        time.time("дата:  "+LocalDate.now());

        BinaryOperator<Integer> maximum = Math::max;
        int result1 = maximum.apply(8, 5);
        System.out.println("Максимум из двух чисел: " + result1);

    }
}
