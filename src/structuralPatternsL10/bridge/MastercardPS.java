package structuralPatternsL10.bridge;

public class MastercardPS implements PaymentSystem {
    @Override
    public void printName() {
        System.out.println("Mastercard");
    }
}
