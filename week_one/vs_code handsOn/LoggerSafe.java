public class LoggerSafe {
    private LoggerSafe() {
        System.out.println("Instance Created");
    }

    private static class SafeInstanceCreator {
        private static final LoggerSafe INSTANCE = new LoggerSafe();
    }

    public static LoggerSafe getInstance() {
        return SafeInstanceCreator.INSTANCE;
    }
}
