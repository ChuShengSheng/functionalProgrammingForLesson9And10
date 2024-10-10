package creationalPatternsL9.singleton;

public class Singleton {
    private Singleton() {
        System.out.println("lazy creation of Singleton");
    }

    static Singleton getInstance() {
        System.out.println("getInstance of Singleton");
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        static {
            System.out.println("init SingletonHolder");
        }

        static final Singleton instance = new Singleton();
    }
}

class SingletonTest {
    public static void main(String[] args) {
        System.out.println("----begin----");
        System.out.println("- singleton1");
        Singleton s1 = Singleton.getInstance();

        System.out.println();
        System.out.println("- singleton2");
        Singleton s2 = Singleton.getInstance();

        System.out.println();

        System.out.printf("singleton1 == singleton2 => %b\n", s1 == s2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("----end----");
    }
}

