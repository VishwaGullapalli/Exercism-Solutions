import java.util.*;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        boolean repeat = false;
        Set<Character> set = new HashSet<>();
        for (char ch: phrase.toLowerCase().toCharArray()) {
            if (!set.add(ch) && Character.isLetter(ch)) {
                repeat = true;
                break;
            }
        }
        if (repeat) {
            return false;
        }
        return true;
    }

}
