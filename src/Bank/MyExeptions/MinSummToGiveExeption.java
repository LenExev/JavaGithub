package Bank.MyExeptions;

public class MinSummToGiveExeption  extends RuntimeException{
    int minSumma;

    public MinSummToGiveExeption(int minSumma) {
        this.minSumma = minSumma;
    }

    @Override
    public String getMessage() {
        return "Минимальная сумма выдачи:  " + minSumma;
    }

}
