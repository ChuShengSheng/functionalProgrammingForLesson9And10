package structuralPatternsL10.security.proxy;

public class SecurityAccesImpl implements SecurityAccess {
    @Override
    public void access() {
        System.out.println("access to bank account");
    }
}
