package object_oriented_programming.person;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Syed");
        person.setLastName("Bakhtiyar");
        person.setAge(13);
        System.out.println("Full Name: " + person.getFullName() + " Age: " + person.getAge() + " Is Teen: " + person.isTeen());
    }
}
