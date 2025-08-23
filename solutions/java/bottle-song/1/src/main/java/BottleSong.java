import java.util.*;

class BottleSong {

    String recite(int startBottles, int takeDown) {
        String output = "";
        Map <Integer, String> map = new HashMap<>();
        map.put(0,"no");
        map.putAll(Map.of(
            1, "One",
            2, "Two",
            3, "Three",
            4, "Four",
            5, "Five",
            6, "Six",
            7, "Seven",
            8, "Eight",
            9, "Nine",
            10, "Ten"
        ));
        for (int i = 0; i < takeDown; i++) {
            output = output + map.get(startBottles) + " green " + (startBottles == 1 ? "bottle" : "bottles") +" hanging on the wall,\n" + map.get(startBottles) +" green "+ (startBottles == 1 ? "bottle" : "bottles") +" hanging on the wall,\n" + "And if one green bottle should accidentally fall,\n" + "There'll be " + map.get(startBottles - 1).toLowerCase() + " green "+ (startBottles - 1 == 1 ? "bottle" : "bottles") +" hanging on the wall.\n" + (i < takeDown - 1 ? "\n" : "");
            startBottles--;
        }
        return output;
    }

}