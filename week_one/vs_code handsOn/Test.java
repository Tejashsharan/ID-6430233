public class Test {
    public static void main(String[] args) {
        System.out.println("Hello World");

        // Unsafe version
        Logger obj1 = Logger.getInstance();
        Logger obj2 = Logger.getInstance();

        if (obj2 == obj1)
            System.out.println("Same instance");
        else
            System.out.println("Different instances");

        // Safer version
        LoggerSafe obj3 = LoggerSafe.getInstance();
        LoggerSafe obj4 = LoggerSafe.getInstance();

        if (obj4 == obj3)
            System.out.println("Same safe instance");
        else
            System.out.println("Different safe instances");
    }
}
