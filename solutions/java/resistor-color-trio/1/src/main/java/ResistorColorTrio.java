import java.util.*;

class ResistorColorTrio {
    private Map<String, Integer> colorMap = new LinkedHashMap<String, Integer>() {{
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
        return colorMap.get(color);
    }

    String label(String[] colors) {
        int baseValue = colorCode(colors[0]) * 10 + colorCode(colors[1]);
        long totalValue = baseValue * (long)Math.pow(10, colorCode(colors[2]));
        if (totalValue >= 1000000000) {
            return (totalValue / 1000000000) + " gigaohms";
        } else if (totalValue >= 1000000) {
            return (totalValue / 1000000) + " megaohms";
        } else if (totalValue >= 1000) {
            return (totalValue / 1000) + " kiloohms";
        } else {
            return totalValue + " ohms";
        }
    }
}