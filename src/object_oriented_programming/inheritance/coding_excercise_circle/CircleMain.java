package object_oriented_programming.inheritance.coding_excercise_circle;

public class CircleMain {
    public static void main(String[] args) {
        Circle circle = new Circle(3.75);
        System.out.println("Circle Radius: " + circle.getRadius());
        System.out.println("Circle Area: " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("Cylinder. radius: " + cylinder.getRadius());
        System.out.println("Cylinder. height: " + cylinder.getHeight());
        System.out.println("Cylinder.getArea: " + cylinder.getArea());
        System.out.println("Cylinder.volume: " + cylinder.getVolume());
    }
}
