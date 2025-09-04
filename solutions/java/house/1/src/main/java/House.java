class House {

    private static final String[] PHRASES = {
        "the horse and the hound and the horn that belonged to ",
        "the farmer sowing his corn that kept ",
        "the rooster that crowed in the morn that woke ",
        "the priest all shaven and shorn that married ",
        "the man all tattered and torn that kissed ",
        "the maiden all forlorn that milked ",
        "the cow with the crumpled horn that tossed ",
        "the dog that worried ",
        "the cat that killed ",
        "the rat that ate ",
        "the malt that lay in ",
        "the house that Jack built."
    };

    String verse(int verse) {
        StringBuilder sb = new StringBuilder("This is ");
        for (int i = PHRASES.length - verse; i < PHRASES.length; i++) {
            sb.append(PHRASES[i]);
        }
        return sb.toString();
    }

    String verses(int startVerse, int endVerse) {
        StringBuilder sb = new StringBuilder();
        for (int i = startVerse; i <= endVerse; i++) {
            sb.append(verse(i));
            if (i != endVerse)
                sb.append("\n");
        }
        return sb.toString();
    }

    String sing() {
        return verses(1, PHRASES.length);
    }
}
