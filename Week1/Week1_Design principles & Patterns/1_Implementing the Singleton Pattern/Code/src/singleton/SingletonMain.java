package singleton;

public class SingletonMain {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("This is a singleton logger.");

        Logger logger2 = Logger.getInstance();
        logger2.log("This should be the same instance.");

        System.out.println("Same object? " + (logger1 == logger2));
    }
}
