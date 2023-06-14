public class CheckQuantityData extends Exception {
    public CheckQuantityData() {
        super("Проверьте введенные данные");
    }

    public CheckQuantityData(String message) {
        super(message);
    }
}