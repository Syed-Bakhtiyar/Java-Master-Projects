package object_oriented_programming_1.wall_area_excercise;

public class WallAreaExcercise {
    private double width;
    private double height;

    public WallAreaExcercise() {
    }

    public WallAreaExcercise(double width, double height) {
        if (width < 0){
            this.width = 0;
        } else {
            this.width = width;
        }

        if(height < 0){
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public void setWidth(double width) {
        if(width < 0){
            this.width = 0;
            return;
        }
        this.width = width;
    }

    public void setHeight(double height) {
        if(height < 0){
            this.height = 0;
            return;
        }
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea(){
        return this.width * this.height;
    }
}
