package object_oriented_programming_1.introduction_to_class;

public class IntroductionClass {
    public static void main(String[] args) {
        Car corolla = new Car();
        Car civic = new Car();
        Car unknown = new Car();
        corolla.setModel("corolla");
        civic.setModel("civic");
        unknown.setModel("charade");
        System.out.println("Model is: " + corolla.getModel());
        System.out.println("Model is: " + civic.getModel());
        System.out.println("Model is: " + unknown.getModel());
    }
}
