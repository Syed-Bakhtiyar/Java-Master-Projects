package object_oriented_programming.point_distance;

public class PointMain {
    public static void main(String[] args) {
        Point p1 = new Point(6, 5);
        Point p2 = new Point(3, 1);
        Point p = new Point();

        System.out.println("P1: " + p1.distance());
        System.out.println("P1: " + p1.distance(p2));
        System.out.println("P1: " + p1.distance(2, 2));
        System.out.println("P: " + p.distance());

    }
}
