import java.util.*;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
        Map <String, String> map = new HashMap<>() {{
            put("AUG", "Methionine");
            put("UUU", "Phenylalanine");
            put("UUC", "Phenylalanine");
            put("UUA", "Leucine");
            put("UUG", "Leucine");
            put("UCU", "Serine");
            put("UCC", "Serine");
            put("UCA", "Serine");
            put("UCG", "Serine");
            put("UAU", "Tyrosine");
            put("UAC", "Tyrosine");
            put("UGU", "Cysteine");
            put("UGC", "Cysteine");
            put("UGG", "Tryptophan");
        }};
        List<String> output = new ArrayList<>();
        for (int i = 0; i < rnaSequence.length(); i+=3) {
            if (i + 3 > rnaSequence.length()) {
                throw new IllegalArgumentException("Invalid codon");
            }
            String checker = rnaSequence.substring(i, i + 3);
            if (checker.equals("UAA") || checker.equals("UAG") || checker.equals("UGA")) {
                return output;
            }
            if (map.get(checker) == null) {
                throw new IllegalArgumentException("Invalid codon");
            }
            output.add(map.get(checker));
        }
        return output;
    }
}
