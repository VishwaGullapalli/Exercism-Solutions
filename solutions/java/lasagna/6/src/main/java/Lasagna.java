public class Lasagna {
    
    public static int expectedMinutesInOven() {
        return 40;
    }
    
    public static int remainingMinutesInOven(int minutes) {
        return expectedMinutesInOven() - minutes;
    }
    
    public static int preparationTimeInMinutes(int layers) {
        return layers*2;
    }
    
    public static int totalTimeInMinutes(int layers, int minutes) {
        return layers*2 + minutes;
    }
}
