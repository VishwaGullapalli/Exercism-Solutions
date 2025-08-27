public class LogLevels {
    
    public static String message(String logLine) {
        return logLine.split(":")[1].trim();
    }

    public static String logLevel(String logLine) {
        return logLine.split("]")[0].replace("[","").trim().toLowerCase();
    }

    public static String reformat(String logLine) {
        String [] lines = logLine.split(":");
        return message(logLine) + " " + lines[0].replace("[", "(").replace("]", ")").toLowerCase().trim();
    }
}
