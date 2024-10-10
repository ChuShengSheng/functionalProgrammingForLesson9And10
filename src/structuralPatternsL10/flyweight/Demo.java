package structuralPatternsL10.flyweight;

public class Demo {
    public static void main(String[] args) {
        //создаем фабрику
        //внутри нее создается тяжелый объект
        var objectFactory = new ObjectFactory();

        //передаем уникальную часть, а общая подставляется в фабрике
        var object1 = objectFactory.create(1);
        System.out.println(object1.toString());

        var object2 = objectFactory.create(1);
        System.out.println(object2.toString());

        var object3 = objectFactory.create(1);
        System.out.println(object3.toString());
    }
}
