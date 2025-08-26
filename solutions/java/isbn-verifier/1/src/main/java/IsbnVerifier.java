class IsbnVerifier {

    boolean isValid(String stringToVerify) {
        char [] stringInCharacters = stringToVerify.replace("-","").toCharArray();
        int arrayLength = stringInCharacters.length;
        if (arrayLength != 10) {
            return false;
        }
        for (int i = 0; i < arrayLength; i++) {
            boolean check = Character.isLetter(stringInCharacters[i]);
            if (check && i != arrayLength - 1) {
                return false;
            } else if (check && i == arrayLength - 1 && stringInCharacters[i] != 'X') {
                return false;
            }
        }
        return checkMathValidity(stringInCharacters);
    }

    boolean checkMathValidity(char [] isbnArray) {
        int solution = 0, counter = 10;
        for (char element: isbnArray) {
            if(element == 'X') {
                solution = solution + 10;
                counter--;
            } else {
                int value = Character.getNumericValue(element);
                solution = solution + (counter * value);
                counter--;
            }
        }
        return solution % 11 == 0 ? true : false;
    }

}
