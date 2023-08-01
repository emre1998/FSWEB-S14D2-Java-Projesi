package bedroom.bedroom;

public class Lamp {
    // Enum for LampType
    public enum LampType {
        TABLE, FLOOR, DESK
    }

    // Private instance variables
    private LampType style;
    private boolean battery;
    private int globRating;

    // Constructor
    public Lamp(LampType style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    // Method to turn on the lamp
    public void turnOn() {
        System.out.println("Lamp is being turned on.");
    }

    // Method to get the style of the lamp
    public LampType getStyle() {
        return style;
    }

    // Method to check if the lamp has a battery
    public boolean isBattery() {
        return battery;
    }

    // Method to get the global rating of the lamp
    public int getGlobRating() {
        return globRating;
    }
}
