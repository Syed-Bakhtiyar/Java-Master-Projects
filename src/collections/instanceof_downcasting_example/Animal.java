package collections.instanceof_downcasting_example;

public class Animal {
    private String specieName;


    public Animal(String specieName) {
        this.specieName = specieName;
    }

    public String getSpecieName(){
        return this.specieName;
    }

    public void printSomeMessage(){
        System.out.println("Parent " + this.getSpecieName());
    }
}
