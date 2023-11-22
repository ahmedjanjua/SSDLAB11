public class Logging {
    private static Logging instance;
    private StringBuilder logMessage;

    private Logging() {
        logMessage = new StringBuilder();
    }

    public static Logging getInstance() {
        if (instance == null) {
            instance = new Logging();
        }
        return instance;
    }

    public void addMessage(String message) {
        logMessage.append(message).append("\n");
    }

    public String getLogMessage() {
        return logMessage.toString();
    }

    public static void main(String[] args) {
        // Get the singleton instance of Log
        Logging log = Logging.getInstance();

        // Add messages to the log
        log.addMessage("SQL");
        log.addMessage("CSS ATTACK");
        log.addMessage("DDoS");

        // Retrieve and print the log messages
        String combinedLog = log.getLogMessage();
        System.out.println("Combined Log:");
        System.out.println(combinedLog);
    }
}


