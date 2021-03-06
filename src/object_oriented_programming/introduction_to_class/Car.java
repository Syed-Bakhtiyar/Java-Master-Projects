package object_oriented_programming.introduction_to_class;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel == "corolla" || validModel == "civic"){
            this.model = model;
        } else {
            this.model = "unknown";
        }
    }

    public String getModel() {
        return model;
    }
}
