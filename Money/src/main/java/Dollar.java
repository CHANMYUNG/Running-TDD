public class Dollar {
    int amount;

    public Dollar(int amoount) {
        this.amount = amoount;
    }

    void times(int multiplier) {
        amount *= multiplier;
    }
}
