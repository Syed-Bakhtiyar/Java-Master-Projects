package expressions_statements_codeBlocks_methods;

public class OverloadingExample {
    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(24);
    }

    public static int calcFeetAndInchesToCentimeters(double feet, double inches) {
        if(feet < 0 || (inches < 0 && inches > 12)){
            return  -1;
        }
        System.out.println(feet + " feet = " + ((feet * 12) * 2.54) + " cm and " + inches + " inc = " + (inches * 2.54) + " cm");
        return 0;
    }

    public static int calcFeetAndInchesToCentimeters(double inches) {
        if(inches < 0){
            return  -1;
        }
        double feet = inches / 12;
        System.out.println("feet: " + feet);
        calcFeetAndInchesToCentimeters(feet, inches);
        return 0;
    }
}
