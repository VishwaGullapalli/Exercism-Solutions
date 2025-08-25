public class JedliksToyCar {

    private int distance;
    private int battery;

    public JedliksToyCar() {
        this.distance = 0;
        this.battery = 100;
    }
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        if (battery == -1) {
        return "Driven " + (distance - 20) + " meters";
        }
        return "Driven " + distance + " meters";
    }

    public String batteryDisplay() {
        if (battery == -1) {
            return "Battery empty";
        }
        return "Battery at " + battery + "%";
    }

    public void drive() {
        distance += 20;
        battery -= 1;
    }
}
