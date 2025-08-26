class LuhnValidator {

    boolean isValid(String candidate) {
        String processed = candidate.strip().replace(" ","");
        if (processed.length() <= 1) {
            return false;
        }
        int sum = 0, ctr = 1;
        for (int i = processed.length() - 1; i >= 0; i--) {
            ctr = ctr > 2 ? 1 : ctr;
            if (!Character.isDigit(processed.charAt(i))) {
                return false;
            }
            int numeric = Character.getNumericValue(processed.charAt(i));
            if (ctr % 2 == 0) {
                numeric *= 2;
                numeric = numeric > 9 ? numeric - 9 : numeric;
            }
            sum += numeric;
            ctr++;
        }
        if (sum % 10 == 0) {
            return true;
        }
        return false;
    }
}
