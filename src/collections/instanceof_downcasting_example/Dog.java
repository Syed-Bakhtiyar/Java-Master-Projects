package collections.instanceof_downcasting_example;

public class Dog extends Animal {

    public Dog() {
        super("Dog");
    }

    public void printSomeMessage(){
        System.out.println("Child " + super.getSpecieName());
    }

    public static Dog downCasting(Animal a){
        Dog d = null;
        if(a instanceof Dog){
            d = (Dog) a;
        }
        return d;
    }
}
