package object_oriented_programming.the_big_picture;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.54, "White");
        super.addHamBurgerAddition1("Chips", 2.75);
        super.addHamBurgerAddition2("Drink", 1.81);
    }

    @Override
    public void addHamBurgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("Cannot add items to a deluxe burger");
    }

    @Override
    public void addHamBurgerAddition2(String addition2Name, double addition2Price) {
        System.out.println("Cannot add items to a deluxe burger");
    }

    @Override
    public void addHamBurgerAddition3(String addition3Name, double addition3Price) {
        System.out.println("Cannot add items to a deluxe burger");
    }

    @Override
    public void addHamBurgerAddition4(String addition4Name, double addition4Price) {
        System.out.println("Cannot add items to a deluxe burger");
    }
}
