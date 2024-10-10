package structuralPatternsL10.composite;

public class Demo {
    public static void main(String[] args) {
        Unit marine1 = new Marine();
        Unit marine2 = new Marine();
        Unit marine3 = new Marine();

        Unit tank = new Tank();

        //Можем объединить юниты в группу
        var group = new Group();
        group.addUnit(marine1);
        group.addUnit(marine2);

        group.move();

        var group2 = new Group();
        group2.addUnit(marine3);
        group2.addUnit(tank);
        group2.addUnit(group2);
        group2.move();
    }
}
