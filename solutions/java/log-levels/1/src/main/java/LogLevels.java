public class LogLevels {
    
    public static String message(String logLine) {
        //throw new UnsupportedOperationException("Please implement the (static) LogLine.message() method");
        return logLine.split(":")[1].trim();
    }

    public static String logLevel(String logLine) {
        //throw new UnsupportedOperationException("Please implement the (static) LogLine.logLevel() method");
        return logline.split("]")[0].replace("[","").trim().toLowerCase();
    }

    public static String reformat(String logLine) {
        //throw new UnsupportedOperationException("Please implement the (static) LogLine.reformat() method");
        logLine.replace("[", "(");
        logLine.replace("]", ")");
        String [] lines = logLine.split(":");
        return lines[0].trim() + " " + lines[1].trim();
    }
}
