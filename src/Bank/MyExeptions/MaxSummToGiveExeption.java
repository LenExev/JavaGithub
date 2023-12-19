package Bank.MyExeptions;

public class MaxSummToGiveExeption  extends RuntimeException{
   private final int maxSumma;

    public MaxSummToGiveExeption(int maxSumma) {
        this.maxSumma = maxSumma;
    }

    @Override
    public String getMessage() {
        return "Максимальная сумма выдачи:  " + maxSumma;
    }

}