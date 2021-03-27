package object_oriented_programming_1.carpet_cost;

public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        return (this.floor.getArea() * this.carpet.getCost());
    }
}
