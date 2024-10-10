package structuralPatternsL10.bridge;

public class CreditCard extends Card {
    public CreditCard(PaymentSystem paymentSystem) {
        super(paymentSystem);
    }

    @Override
    protected void cardType() {
        System.out.println("Credit Card");
    }
}
