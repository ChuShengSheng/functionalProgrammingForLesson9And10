package structuralPatternsL10.adapter;

public class Demo {
    public static void main(String[] args) {
        new Demo().usePattern();
        new Demo().alternative();
    }

    private void usePattern() {
        var rotaryHammer = new RotaryHammer();
        var drill = new Drill();
        //Используем сверло через адаптер
        rotaryHammer.drill(new SDSadapter(drill));
    }

    private void alternative() {
        var rotaryHammer = new RotaryHammer();
        var drill = new Drill();
        //В нашем простом примере можно использовать просто лямбду
        rotaryHammer.drill(() -> System.out.println(drill));
    }

}
