package structuralPatternsL10.security.proxy;

public class Demo {
    public static void main(String[] args) {
        security();
    }

    private static void security() {
        SecurityAccess proxy = new SecurityProxy(new SecurityAccesImpl());
        proxy.access();
    }
}
