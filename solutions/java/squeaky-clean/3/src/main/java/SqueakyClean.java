class SqueakyClean {
    static String clean(String identifier) {
        String output = "";
        for (int i = 0; i < identifier.length(); i++) {
            char character = identifier.charAt(i);
            if (character == ' ') {
                output = output + '_';
            } else if(character == '-') {
                if(i + 1 < identifier.length()) {
                    while (identifier.charAt(i + 1) == '-') {
                        i++;
                    }
                    output = output + Character.toUpperCase(identifier.charAt(i + 1));
                    i++;
                }
            } else if (Character.isDigit(character)){
                switch(character) {
                    case '4':
                        output = output + 'a';
                        break;
                    case '3':
                        output = output + 'e';
                        break;
                    case '0':
                        output = output + 'o';
                        break;
                    case '1':
                        output = output + 'l';
                        break;
                    case '7':
                        output = output + 't';
                        break;
                }
            } else if (!Character.isLetter(character)) {
                continue;
            } else {
                output = output + character;
            }
        }
        return output;
    }
}
