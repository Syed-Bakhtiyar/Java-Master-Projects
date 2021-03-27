package object_oriented_programming_1.inheritance.vehicle;

public class SpecificCar extends Car {
    private int roadServiceMonths;

    public SpecificCar(int roadServiceMonths) {
        super("Corolla", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate){
        int newVeloity = getCurrentVelocity() + rate;
        if (newVeloity == 0){
            stop();
        } else if(newVeloity > 0 && newVeloity <= 10){
            changeGear(1);
        } else if(newVeloity > 10 && newVeloity <= 20){
            changeGear(2);
        } else if(newVeloity > 20 && newVeloity <= 30){
            changeGear(3);
        } else {
            changeGear(4);
        }

        if(newVeloity > 0) {
            changeVelocity(newVeloity, getCurrentDirection());
        }
    }
}
