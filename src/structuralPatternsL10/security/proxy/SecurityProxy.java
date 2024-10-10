package structuralPatternsL10.security.proxy;

public class SecurityProxy implements SecurityAccess {

    private SecurityAccess securityAccess;

    public SecurityProxy(SecurityAccess securityAccess) {
        this.securityAccess = securityAccess;
    }

    @Override
    public void access() {
        System.out.println("before");
        securityAccess.access();
        System.out.println("after");
    }
}
