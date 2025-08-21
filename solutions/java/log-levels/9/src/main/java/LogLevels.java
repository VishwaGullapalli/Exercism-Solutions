public class LogLevels {
    
    public static String message(String logLine) {
        //throw new UnsupportedOperationException("Please implement the (static) LogLine.message() method");
        return logLine.split(":")[1].trim();
    }

    public static String logLevel(String logLine) {
        //throw new UnsupportedOperationException("Please implement the (static) LogLine.logLevel() method");
        return logLine.split("]")[0].replace("[","").trim().toLowerCase();
    }

    public static String reformat(String logLine) {
        //throw new UnsupportedOperationException("Please implement the (static) LogLine.reformat() method");
        String [] lines = logLine.split(":");
        // lines[0].replace("[", "(");
        // lines[0].replace("]", ")");
        return lines[1].trim() + " " + lines[0].replace("[", "(").replace("]", ")").toLowerCase().trim();
    }
}
