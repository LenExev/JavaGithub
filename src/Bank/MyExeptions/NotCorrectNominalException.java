package Bank.MyExeptions;

public class NotCorrectNominalException extends RuntimeException{
    @Override
    public String getMessage() {
        return "Купюра не распознана";
    }

}
