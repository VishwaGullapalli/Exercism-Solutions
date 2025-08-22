import java.util.TreeMap;

class PhoneNumber {

    private final String numberString;
    PhoneNumber(String numberString) {
        String solution = "";
        TreeMap <Character, String> map = new TreeMap<>();
        map.put('0', "zero");
        map.put('1', "one");
        boolean hasChar = numberString.matches(".*[a-zA-Z].*");
        if (hasChar) {
            throw new IllegalArgumentException("letters not permitted");
        }
        boolean hasPunctuations = numberString.matches(".*[@:!].*");
        if (hasPunctuations) {
            throw new IllegalArgumentException("punctuations not permitted");
        }
        String numbersOnly = numberString.replaceAll("[^0-9]", "");
        int length = numbersOnly.length();
        if (length < 10 ) {
            throw new IllegalArgumentException("must not be fewer than 10 digits");
        }
        if (length == 11 && numbersOnly.startsWith("1")) {
            solution = numbersOnly.substring(1);
        } 
        if (length == 11 && !numbersOnly.startsWith("1")) {
            throw new IllegalArgumentException("11 digits must start with 1");
        }
        if (length > 11) {
            throw new IllegalArgumentException("must not be greater than 11 digits");
        }
        if (length == 11 && (numbersOnly.charAt(1) == '0' || numbersOnly.charAt(1) == '1')) {
            throw new IllegalArgumentException("area code cannot start with " + map.get(numbersOnly.charAt(1)));
        }
        if (length == 11 && (numbersOnly.charAt(4) == '0' || numbersOnly.charAt(4) == '1')) {
            throw new IllegalArgumentException("exchange code cannot start with " + map.get(numbersOnly.charAt(4)));
        }
        if (length == 10) {
            solution = numbersOnly;
        }
        if (length == 10 && (numbersOnly.charAt(0) == '0' || numbersOnly.charAt(0) == '1')) {
            throw new IllegalArgumentException("area code cannot start with " + map.get(numbersOnly.charAt(0)));
        }
        if (length == 10 && (numbersOnly.charAt(3) == '0' || numbersOnly.charAt(3) == '1')) {
            throw new IllegalArgumentException("exchange code cannot start with " + map.get(numbersOnly.charAt(3)));
        }
        this.numberString = solution;
    }

    String getNumber() {
        return numberString;
    }

}