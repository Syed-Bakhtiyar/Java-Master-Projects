package interfaces_abstract_and_inner_classes.abstract_classes.introduction;

public abstract class Bird extends Animal implements CanFly {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() +" is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("breathe in, breathe out, repeat");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " flapping its wings");
    }
}
