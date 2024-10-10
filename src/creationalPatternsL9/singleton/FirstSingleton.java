package creationalPatternsL9.singleton;

public class FirstSingleton {
    private static FirstSingleton instance = new FirstSingleton();

    private FirstSingleton() {
        System.out.println("run constructor");
    }

    public static FirstSingleton getInstance() {
        return instance;
    }
}

class FirstSingletonTest{
    public static void main(String[] args) {
        System.out.println("----begin----");
        FirstSingleton firstSingleton1 = FirstSingleton.getInstance();
        FirstSingleton firstSingleton2 = FirstSingleton.getInstance();

        System.out.println(firstSingleton1);
        System.out.println(firstSingleton2);

        System.out.printf("singleton1 == singleton2 => %b\n", firstSingleton1 == firstSingleton2);
        System.out.println("----end----");
    }
}
