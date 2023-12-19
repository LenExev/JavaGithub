package Bank;

import java.util.ArrayList;
import java.util.List;
import Bank.MonyeBox;
import Bank.MyExeptions.AtmIsAlreadyFullOfMoneyBoxes;
import Bank.MyExeptions.ExceptionOfCreatingBank;

public class Bank {
   private final int countAtms;
    public List<ATM> list= new ArrayList<>();
    public Bank(int number,int summa,int min,int max){
        countAtms = number;
        int summ=summa/number;
        try {
            for (int index = 0; index < number - 1; index++) {
                createAtm(summ, min, max);
            }
            int summ2=summa-summ*(number-1);
            createAtm(summ2, min, max);
        }
        catch(Exception e){
           throw new ExceptionOfCreatingBank(this);
        }
    }
public void createAtm( int summa,int min,int max){
    ATM atm1 = new ATM(min,max);
        if(summa % 800 == 0){
            createMoneyBoxesToAtmType1(atm1,summa);
        }
        else{
            createMoneyBoxesToAtmType2(atm1,summa);
        }
    list.add(atm1);
}
    public void addAtm( ATM atm){

        list.add(atm);
    }

    public int CurentSummInAllAtms(){
        int res=0;
        for (var atm:list ) {
            res+=atm.countCurrentSumm();
        }
        return res;
    }
    public int getCountAtm(){
        return list.size();
   }
    public void createMoneyBoxesToAtmType1(ATM atm1,int summa){


        int dopSumma=0;
        int lessSumm=summa;

        int summ=summa*62/100;
        summ=checkSumm(summ,lessSumm);
        int putSumma1= addMonyeBox500( atm1,summ);
        dopSumma=summ-putSumma1;
        lessSumm -= putSumma1;

        summ= summa*25/100 + dopSumma;
        summ=checkSumm(summ,lessSumm);
        int putSumma2= addMonyeBox200( atm1,summ);
        dopSumma =summ-putSumma2;
        lessSumm -= putSumma2;

        summ= summa-putSumma2-putSumma1 + dopSumma;
        summ=checkSumm(summ,lessSumm);
        int putSumma3= addMonyeBox100( atm1,summ);
        dopSumma = summ-putSumma3;

        if(dopSumma != 0){
            throw new AtmIsAlreadyFullOfMoneyBoxes(dopSumma);
        }
    }
    public void createMoneyBoxesToAtmType2(ATM atm1,int summa){
        int summa1 = summa;
        int dopSumma=0;
        int lessSumm=summa;

        int summ=summa1*64/100;
        summ = checkSumm(summ,lessSumm);
        int putSumma1= addMonyeBox500( atm1,summ);
        dopSumma=summ-putSumma1;
        lessSumm -= putSumma1;


        summ= summa1*25/100 + dopSumma;
        summ=checkSumm(summ,lessSumm);
        int putSumma2= addMonyeBox200( atm1,summ);
        dopSumma=summ-putSumma2;
        lessSumm -= putSumma2;

        summ= summa1*10/100 + dopSumma;
        summ=checkSumm(summ,lessSumm);
        int putSumma3= addMonyeBox100( atm1,summ);
        dopSumma=summ-putSumma3;
        lessSumm -= putSumma3;

        summ = summa1-putSumma1-putSumma2-putSumma3 + dopSumma;
        summ=checkSumm(summ,lessSumm);
        int putSumma4= addMonyeBox50( atm1,summ);
        dopSumma=summ-putSumma4;
        lessSumm -= putSumma4;

        summ = summa1-putSumma1-putSumma2-putSumma3-putSumma4 + dopSumma;
        summ=checkSumm(summ,lessSumm);
        int putSumma5= addMonyeBox20( atm1,summ);
        dopSumma=summ-putSumma5;
        lessSumm -= putSumma5;

        summ = summa1-putSumma1-putSumma2-putSumma3-putSumma4-putSumma5 + dopSumma;
        summ=checkSumm(summ,lessSumm);
        int putSumma6= addMonyeBox10( atm1,summ);
        dopSumma=summ-putSumma6;
        lessSumm -= putSumma6;

        summ = summa1-putSumma1-putSumma2-putSumma3-putSumma4-putSumma5-putSumma6 + dopSumma;
        summ=checkSumm(summ,lessSumm);
        int putSumma7= addMonyeBox5( atm1,summ);
        dopSumma=summ-putSumma7;
        lessSumm -= putSumma7;

        summ = summa1-putSumma1-putSumma2-putSumma3-putSumma4-putSumma5-putSumma6-putSumma7 + dopSumma;
        summ=checkSumm(summ,lessSumm);
        int putSumma8= addMonyeBox2( atm1,summ);
        dopSumma=summ-putSumma8;
        lessSumm -= putSumma8;

        summ = summa1-putSumma1-putSumma2-putSumma3-putSumma4-putSumma5-putSumma6-putSumma7-putSumma8 + dopSumma;
        summ=checkSumm(summ,lessSumm);
        int putSumma9= addMonyeBox1( atm1,summ);
        dopSumma=summ-putSumma9;


        if(dopSumma != 0){
            throw new AtmIsAlreadyFullOfMoneyBoxes(dopSumma);
        }
    }

    public int addMonyeBox500(ATM atm1,int summa){
        int count1=summa/500;
        try{
            atm1.addMoneyBox(500, count1);
            return count1*500;
        }
        catch(Exception e){
            count1=1000;
            atm1.addMoneyBox(500, count1);
            return count1*500;
        }
    }
    public int addMonyeBox200(ATM atm1,int summa){
        int count1=summa/200;
        try{
            atm1.addMoneyBox(200, count1);
            return count1*200;
        }
        catch(Exception e){
            count1=1000;
            atm1.addMoneyBox(200, count1);
            return count1*200;
        }
    }
    public int addMonyeBox100(ATM atm1,int summa){
        int count1=summa/100;
        try{
            atm1.addMoneyBox(100, count1);
            return count1*100;
        }
        catch(Exception e){
            count1=1000;
            atm1.addMoneyBox(100, count1);
            return count1*100;
        }
    }
    public int addMonyeBox50(ATM atm1,int summa){
        int count1=summa/50;
        try{
            atm1.addMoneyBox(50, count1);
            return count1*50;
        }
        catch(Exception e){
            count1=1000;
            atm1.addMoneyBox(50, count1);
            return count1*50;
        }
    }
    public int addMonyeBox20(ATM atm1,int summa){
        int count1=summa/20;
        try{
            atm1.addMoneyBox(20, count1);
            return count1*20;
        }
        catch(Exception e){
            count1=1000;
            atm1.addMoneyBox(20, count1);
            return count1*20;
        }
    }
    public int addMonyeBox10(ATM atm1,int summa){
        int count1=summa/10;
        try{
            atm1.addMoneyBox(10, count1);
            return count1*10;
        }
        catch(Exception e){
            count1=1000;
            atm1.addMoneyBox(10, count1);
            return count1*10;
        }
    }
    public int addMonyeBox5(ATM atm1,int summa){
        int count1=summa/5;
        try{
            atm1.addMoneyBox(5, count1);
            return count1*5;
        }
        catch(Exception e){
            count1=1000;
            atm1.addMoneyBox(5, count1);
            return count1*5;
        }
    }
    public int addMonyeBox2(ATM atm1,int summa){
        int count1=summa/2;
        try{
            atm1.addMoneyBox(2, count1);
            return count1*2;
        }
        catch(Exception e){
            count1=1000;
            atm1.addMoneyBox(2, count1);
            return count1*2;
        }
    }
    public int addMonyeBox1(ATM atm1,int summa){
        int count1=summa;
        try{
            atm1.addMoneyBox(1, count1);
            return count1;
        }
        catch(Exception e){
            count1=1000;
            atm1.addMoneyBox(1, count1);
            return count1;
        }
    }
    public int checkSumm(int summ,int summ2){
        if(summ>summ2){
            summ = summ2;
        }
        if(summ < 0){
            summ = 0;
        }
        return summ;
    }
}

