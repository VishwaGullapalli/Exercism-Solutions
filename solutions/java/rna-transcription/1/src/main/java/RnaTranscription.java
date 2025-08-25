import java.util.*;

class RnaTranscription {

    String transcribe(String dnaStrand) {
        Map <Character, Character> map = new HashMap<>(){{
            put('G', 'C');
            put('C', 'G');
            put('T', 'A');
            put('A', 'U');
        }};
        String output = "";
        for (char n: dnaStrand.toCharArray()) {
            output += map.get(n);
        }
        return output;
    }

}
