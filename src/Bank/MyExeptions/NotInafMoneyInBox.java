package Bank.MyExeptions;

public class NotInafMoneyInBox  extends RuntimeException{
    private final int count;
    public NotInafMoneyInBox(int number) {
        count=number;
    }

    @Override
    public String getMessage() {
        return "Нет денег в контейнере";
    }

    public int getCount() {
        return count;
    }
}

