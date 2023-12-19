package Bank;

import Bank.MyExeptions.ExceptionOfCreatingBank;

public class Main {
    public static void main(String[] args) {
try {
    Bank bank = new Bank(3, 2300325, 1000, 20000);
   // Bank bank = new Bank(2, 800000, 1000, 20000);
    int c=bank.getCountAtm();
    System.out.println("Создан банк. Создано  "+ c +" банкомата");
    int summa = bank.CurentSummInAllAtms();
    System.out.println("Общая сумма в банке:  " + summa);
    bank.list.get(1).giveOutMoney(10200);
     summa = bank.CurentSummInAllAtms();
    System.out.println("Общая сумма в банке:  " + summa);
    System.out.println("     *******");

    bank.list.get(1).giveOutMoney(23220);
    summa = bank.CurentSummInAllAtms();
    System.out.println("Общая сумма в банке:  " + summa);
    System.out.println("     *******");

    bank.list.get(1).giveOutMoney(13270);
        summa = bank.CurentSummInAllAtms();
        System.out.println("Общая сумма в банке:  " + summa);
    System.out.println("     *******");

    bank.list.get(1).putInMoneyBox(20,500);
        summa = bank.CurentSummInAllAtms();
        System.out.println("Общая сумма в банке:  " + summa);
    System.out.println("     *******");

    bank.list.get(1).putInMoneyBox(320,500);
        summa = bank.CurentSummInAllAtms();
        System.out.println("Общая сумма в банке:  " + summa);
    System.out.println("     *******");

    bank.list.get(1).putInMoneyBox(20,50);
    summa = bank.CurentSummInAllAtms();
    System.out.println("Общая сумма в банке:  " + summa);
    System.out.println("     *******");

}
catch(ExceptionOfCreatingBank e) {

    System.out.println(e.getMessage());
    int c = e.getBank().getCountAtm();
    System.out.println(c);
    int summa = e.getBank().CurentSummInAllAtms();
    System.out.println("Общая сумма в банке:  " + summa);
}
catch(Exception e){
    System.out.println("некорректные операции");
}
    }

}
