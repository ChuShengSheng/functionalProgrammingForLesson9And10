package structuralPatternsL10.bridge;

public class MirPS implements PaymentSystem {

   @Override
    public void printName() {
       System.out.println("Mir");
   }
}
