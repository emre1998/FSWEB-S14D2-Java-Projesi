package bedroom.bedroom;

import bedroom.bedroom.Carpet;

public class Ceiling {
    private int height;
    private PaintColor paintedColor;

    public enum PaintColor {
        WHITE,BEIGE,LIGHT_BLUE,GREY,PINK,YELLOW
    }
    public Ceiling(int height, PaintColor paintedColor) {
        this.height =height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getPaintedColor() {
        return paintedColor;
    }
    public void create() {
        System.out.println("Ceiling height: " +height + " cm");
        System.out.println("Painted color: " + paintedColor);
    }
}
