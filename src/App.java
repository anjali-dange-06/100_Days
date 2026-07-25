import pattern.SingletonPattern;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println(SingletonPattern.getInstance().getValue());
    }
}
