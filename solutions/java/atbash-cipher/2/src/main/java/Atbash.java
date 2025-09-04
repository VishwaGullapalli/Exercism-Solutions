class Atbash {

    String encode(String input) {
        String plain = "abcdefghijklmnopqrstuvwxyz";
        String cipher = "zyxwvutsrqponmlkjihgfedcba";
        StringBuilder out = new StringBuilder();
        int ct = 0;
        for (char c : input.toLowerCase().toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                if (ct > 0 && ct % 5 == 0) out.append(' ');
                out.append(Character.isLetter(c) ? cipher.charAt(plain.indexOf(c)) : c);
                ct++;
            }
        }
        return out.toString();
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
