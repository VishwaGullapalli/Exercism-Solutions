public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    static int expectedMinutesInOven() {
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    static int remainingMinutesInOven(int minutes) {
        return expectedMinutesInOven() - minutes;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    static int preparationTimeInMinutes(int layers) {
        return layers*2;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    static int totalTimeInMinutes(int layers, int minutes) {
        return layers*2 + minutes;
    }
}
