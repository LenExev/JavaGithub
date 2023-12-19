package Bank.MyExeptions;

public class MoneyBoxIsFullExeption   extends RuntimeException{
    private final int count;
    public MoneyBoxIsFullExeption(int number) {
        count=number;
    }

    @Override
    public String getMessage() {
        return "Банкомат заполнен";
    }

    public int getCount() {
        return count;
    }
}
