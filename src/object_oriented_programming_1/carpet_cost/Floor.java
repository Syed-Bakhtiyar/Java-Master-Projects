package object_oriented_programming_1.carpet_cost;

public class Floor {
    private double width;
    private double height;

    public Floor(double width, double length) {
        this.width = (width < 0) ? 0 : width;
        this.height = (length < 0) ? 0 : length;
    }

    public double getArea(){
        return (this.width * this.height);
    }
}
