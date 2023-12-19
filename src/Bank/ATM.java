package Bank;

import Bank.MyExeptions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ATM {
private List<MonyeBox> moneyBoxes = new ArrayList<>();

   private final int minSummOut;
   private final int maxSummOut;
   private final int maxNumberMoneyBoxes = 9;

   private int currentSumm = 0;

   public ATM( int minSummOut, int maxSummOut) {

      this.minSummOut = minSummOut;
      this.maxSummOut = maxSummOut;

   }
   public int countCurrentSumm(){
      int res = 0;
      for (var m :moneyBoxes ) {
         res += (m.getCount()*m.getNominal());
      }
      return res;
   }
   public void addMoneyBox(int nominal,int count){
       try {
           if (moneyBoxes.size() <= maxNumberMoneyBoxes) {
               MonyeBox m = new MonyeBox(nominal, count);
               moneyBoxes.add(m);
           } else {
               throw new AtmIsAlreadyFullOfMoneyBoxes(0);
           }
       }
       catch(NotCorrectNominalException e){
          // System.out.println("Контейнеp"+nominal+" для денег не добавлен в банкомат:  " + e.getMessage());
           throw e;
       }
       catch(OutOfMaxSummOfMoneyBoxExeption e){
           //System.out.println("Контейнеp"+nominal+"  для денег не добавлен в банкомат:  " + e.getMessage());
           throw e;
       }
   }

   public void minusCount( MonyeBox mb, int number) {
      int newCount = mb.getCount()-1;
      if(newCount < 0 ){
         throw new NotInafMoneyInBox(number);
      }
      else{
         mb.setCount(newCount);
      }
   }
   public void plusCount( MonyeBox mb,  int number) {
      int newCount = mb.getCount() + 1;
      if(newCount > mb.getMaxCount() ){
         throw new MoneyBoxIsFullExeption(number);
      }
      else{
         mb.setCount(newCount);
      }
   }
   public void giveOutMoney(int n){
       try {
          if( n < minSummOut){
            throw new MinSummToGiveExeption(minSummOut);
           }
           else if( n > maxSummOut){
               throw new MaxSummToGiveExeption(maxSummOut);
           }
          else{
              int takeSumm=0;
              int giveOutSumma = takeMoneyFromBox(n, 500);
              takeSumm += giveOutSumma;
               giveOutSumma = takeMoneyFromBox(n - takeSumm, 200);
              takeSumm += giveOutSumma;
               giveOutSumma = takeMoneyFromBox(n - takeSumm, 100);
              takeSumm += giveOutSumma;
               giveOutSumma = takeMoneyFromBox(n - takeSumm, 50);
              takeSumm += giveOutSumma;
               giveOutSumma = takeMoneyFromBox(n - takeSumm, 20);
              takeSumm += giveOutSumma;
               giveOutSumma = takeMoneyFromBox(n - takeSumm, 10);
              takeSumm += giveOutSumma;
               giveOutSumma = takeMoneyFromBox(n - takeSumm, 5);
              takeSumm += giveOutSumma;
              giveOutSumma = takeMoneyFromBox(n - takeSumm, 2);
              takeSumm += giveOutSumma;
              giveOutSumma = takeMoneyFromBox(n - takeSumm, 1);
              takeSumm += giveOutSumma;

              printCheck(takeSumm,n);
          }
       }
       catch (MinSummToGiveExeption e){
           System.out.println(e.getMessage());
       }
       catch (MaxSummToGiveExeption e){
           System.out.println(e.getMessage());
       }
   }
   public int takeMoneyFromBox(int summa, int nominal){
       int giveOutSumma = 0;
       int number1 = summa/nominal;
       if(number1 > 0){
           MonyeBox monyebox = findMoneyBox(nominal);
           if (monyebox != null){
               boolean have = true;
               int numberCoupure = 0;
               while(number1 > 0 && have) {
                   try {
                       minusCount(monyebox,numberCoupure);
                       numberCoupure++;
                       number1--;
                   } catch (NotInafMoneyInBox e) {
                       numberCoupure=e.getCount();
                       have=false;
                   }
               }
               giveOutSumma += numberCoupure * nominal;
           }
       }
       return giveOutSumma;
   }
    public MonyeBox findMoneyBox(int nominal){
        for (var m :moneyBoxes ) {
            if(m.getNominal()==nominal){
                return m;
            }
        }
        return null;
    }
    private void printCheck(int summa, int wantedSumma){
        if(summa != wantedSumma){
            System.out.println("Возможно выдать только сумму:  " + summa);
            System.out.println("Подтвердите выдачу этой суммы: нажмите 1");
            try{
                Scanner scanner = new Scanner(System.in);
                int choise= scanner.nextInt();
                if(choise==1){
                    System.out.println("Заберите деньги в сумме: " + summa);
                }
            }
            catch(Exception e) {
                System.out.println("Отмена операции!");
            }
        }
        else{
            System.out.println("Возьмите свои деньги в сумме:  " + summa);
        }
    }
    public void putInMoneyBox(int count,int nominal){
       int summa=count*nominal;
       boolean success=true;
        if(nominal ==1 ||nominal ==2 ||nominal ==5 ||nominal ==10 ||nominal ==20 ||
                nominal ==50 ||nominal ==100 ||nominal ==200 ||nominal ==500){
            int putSumma = 0;
            if(count > 0){
                 MonyeBox monyebox = findMoneyBox(nominal);
                if (monyebox != null){
                   boolean have = true;
                   int numberCoupure = 0;
                   while(count > 0 && have) {
                    try {
                        plusCount(monyebox,numberCoupure);
                        numberCoupure++;
                        count--;
                    } catch (MoneyBoxIsFullExeption e) {
                        numberCoupure=e.getCount();
                        have=false;
                        success=false;
                    }
                }
                   if( success) {
                       putSumma += numberCoupure * nominal;
                       System.out.println("вы положили сумму:  " + putSumma);
                   }else{
                       putSumma += numberCoupure * nominal;
                       System.out.println("Вы можете положить только сумму:  " + putSumma );
                       System.out.println("Подтвердить операцию - нажмите 1");
                       try{
                           Scanner scanner = new Scanner(System.in);
                           int choise= scanner.nextInt();
                           if(choise==1){
                               int change = count * nominal;
                               System.out.println("Вы положили деньги в сумме: " + putSumma);
                               System.out.println("Заберите сдачу в сумме: " + change);
                           }
                           else{
                               int coun=monyebox.getCount();
                              monyebox.setCount(coun-numberCoupure);
                               System.out.println("Отмена операции! Заберите деньги в сумме: "+ summa);
                           }
                       }
                       catch(Exception e) {
                           int coun=monyebox.getCount();
                           monyebox.setCount(coun-numberCoupure);
                           System.out.println("Отмена операции! Заберите деньги в сумме: "+ summa);
                       }
                   }
            }
            else{
                System.out.println("банкомат не может принять такие купюры");
            }
        }
        else{
            System.out.println("Вы не загрузили деньги в банкомат");
        }
        }else{
            throw new NotCorrectNominalException();
        }
    }
    public void printCurrentSummByNomenal(){
        for (var mb : moneyBoxes ) {
            System.out.println(mb.getNominal() +" * "+ mb.getCount() +" = "+ mb.getCount()*mb.getNominal());
        }
    }
    public void statisticAtm(){
        printCurrentSummByNomenal();
        System.out.println("Итого в банкомате:  " + countCurrentSumm());
    }
}
