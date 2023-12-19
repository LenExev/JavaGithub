package InnerClasses;

public class ToLongNoActivity extends RuntimeException{
    @Override
    public String getMessage() {
        return "Приставка завершила работу из-за отсутствия активности";
    }
}
