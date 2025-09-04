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
        String plain = "abcdefghijklmnopqrstuvwxyz", cipher = "zyxwvutsrqponmlkjihgfedcba";
        StringBuilder out = new StringBuilder();
        for (char c : input.replace(" ", "").toLowerCase().toCharArray())
            out.append(Character.isLetter(c) ? plain.charAt(cipher.indexOf(c)) : c);
        return out.toString();
    }
    
}
