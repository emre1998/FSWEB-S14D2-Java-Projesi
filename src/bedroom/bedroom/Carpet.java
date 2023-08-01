package bedroom.bedroom;

public class Carpet {
    // Private instance variables
    private int width;
    private int height;
    private PaintColor color;

    // Enum for PaintColor
    public enum PaintColor {
        RED, BLUE, GREEN, YELLOW, WHITE, BLACK
    }

    // Constructor
    public Carpet(int width, int height, PaintColor color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    // Getter methods
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getColor() {
        return color;
    }

    // Method to lie the carpet
    public void lying() {
        System.out.println("Carpet is lying on Bedroom floor.");
    }
}
