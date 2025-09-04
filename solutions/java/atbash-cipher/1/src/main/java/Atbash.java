class Atbash {

    String encode(String input) {
        String plain = "abcdefghijklmnopqrstuvwxyz";
        String cipher = "zyxwvutsrqponmlkjihgfedcba";
        String output = "";
        int ct = 0;
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                if (ct == 5) {
                    output += " ";
                    ct = 0;
                }
                int index = plain.indexOf(c);
                output += cipher.charAt(index);
                ct++;
            } else if (Character.isDigit(c)) {
                if (ct == 5) {
                    output += " ";
                    ct = 0;
                }
                output += c;
                ct++;
            }
        }
        return output;
    }


    String decode(String input) {
        String plain = "abcdefghijklmnopqrstuvwxyz";
        String cipher = "zyxwvutsrqponmlkjihgfedcba";
        String output = "";
        input = input.replace(" ", "").toLowerCase(); 
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                int index = cipher.indexOf(c);
                output += plain.charAt(index);
            } else if (Character.isDigit(c)) {
                output += c;
            }
        }
        return output;
    }

}
