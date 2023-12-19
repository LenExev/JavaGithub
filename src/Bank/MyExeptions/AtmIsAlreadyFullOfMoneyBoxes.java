package Bank.MyExeptions;

public class AtmIsAlreadyFullOfMoneyBoxes extends RuntimeException{
    private final int summ;
    public AtmIsAlreadyFullOfMoneyBoxes(int number) {
        summ=number;
    }
    @Override
    public String getMessage() {
        return "Банкомат уже максимально наполнен наполнен";
    }

    public int getSumm() {
        return summ;
    }
}
