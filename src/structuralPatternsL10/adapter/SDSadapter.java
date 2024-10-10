package structuralPatternsL10.adapter;

public class SDSadapter implements SDSdrill {
    private Drill drill;

    public SDSadapter(Drill drill) {
        this.drill = drill;
    }

    @Override
    public void action() {
        //Адаптер не содержит логики
        //Он делегирует работу адаптируемых классов
        System.out.println(this.drill);
    }
}
