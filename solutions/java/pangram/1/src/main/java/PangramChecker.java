public class PangramChecker {

    public boolean isPangram(String input) {
        String cleanInput = input.replaceAll(" ", "").toLowerCase();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!cleanInput.contains(String.valueOf(ch))) {
                return false;
            }
        } 
        return true;
    }

}
