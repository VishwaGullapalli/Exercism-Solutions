class Proverb {

    private String output = "";
    
    Proverb(String[] words) {
        if (words.length == 0) {
            return;
        }
        for(int i = 0; i < words.length - 1; i++) {
            output += "For want of a " + words[i] + " the " + words[i+1] + " was lost.\n";
        }
        output += "And all for the want of a " + words[0] + ".";
    }

    String recite() {
        System.out.println(output);
        return output;
    }

}
