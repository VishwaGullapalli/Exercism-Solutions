import java.util.*;

class RomanNumerals {
    
    private String output;
    
    RomanNumerals(int number) {
        TreeMap <Integer, String> map = new TreeMap<>();
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");
        output = toRoman(map, number);
    }

    String toRoman(TreeMap <Integer,String> map,int number) {
        int low = map.floorKey(number);
        if (number == low) {
            return map.get(number);
        }
        return map.get(low) + toRoman(map, number - low);
    }

    String getRomanNumeral() {
        return output;
    }
}
