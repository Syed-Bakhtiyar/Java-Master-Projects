package object_oriented_programming.inheritance.composition_hasA_Example;

public class Ceiling {
    private int height;
    private int paintedColor;

    public Ceiling(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public int getPaintedColor() {
        return paintedColor;
    }
}
