package StructuralPatterns;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Subject proxy = new Proxy();
        proxy.request();
    }
}
