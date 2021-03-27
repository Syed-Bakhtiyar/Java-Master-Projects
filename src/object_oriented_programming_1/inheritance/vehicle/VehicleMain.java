package object_oriented_programming_1.inheritance.vehicle;

public class VehicleMain {
    public static void main(String[] args) {
        SpecificCar car = new SpecificCar(36);
        car.steer(45);
        car.accelerate(30);
        car.accelerate(20);
        car.accelerate(-42);
    }
}
