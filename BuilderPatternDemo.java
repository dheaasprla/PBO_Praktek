package CreationalPatterns;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new ConcreteBuilder();

        director.setBuilder(builder);
        Product product = director.construct();
        product.show();
    }
}
