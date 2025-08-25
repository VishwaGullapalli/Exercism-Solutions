import java.util.*;

class ResistorColor {
    Map <String, Integer> map = new LinkedHashMap<>() {{
        put("black", 0);
        put("brown", 1);
        put("red", 2);
        put("orange", 3);
        put("yellow", 4);
        put("green", 5);
        put("blue", 6);
        put("violet", 7);
        put("grey", 8);
        put("white", 9);                                 
    }};
    int colorCode(String color) {
        return map.get(color);
    }

    String[] colors() {
        String [] colorsArray = (map.keySet().toArray(new String[0]));
        return colorsArray; 
    }
}
