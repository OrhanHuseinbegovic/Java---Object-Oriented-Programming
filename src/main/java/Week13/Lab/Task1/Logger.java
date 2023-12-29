package Week13.Lab.Task1;

public class Logger {
    private static Logger instance;
    private Logger(){

    }
    public static Logger getInstance(){
        synchronized (Logger.class) {
            if (Logger.instance == null) {
                Logger.instance = new Logger();
            }
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("[LOG] " + message);
    }

    public void logInfo(String message) {
        System.out.println("[INFO] " + message);
    }

    public void logWarning(String message) {
        System.out.println("[WARNING] " + message);
    }

    public void logError(String message) {
        System.out.println("[ERROR] " + message);
    }
}


