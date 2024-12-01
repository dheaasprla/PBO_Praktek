package StructuralPatterns;

class Proxy implements Subject {
    private RealSubject realSubject;

    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        System.out.println("Proxy: Adding additional logic before delegating to RealSubject.");
        realSubject.request();
    }
}
