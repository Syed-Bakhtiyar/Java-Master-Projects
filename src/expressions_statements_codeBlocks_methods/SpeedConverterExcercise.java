package expressions_statements_codeBlocks_methods;

public class SpeedConverterExcercise {
    public static void main(String[] args) {
    // 1 mile = 1.609 KM
        printConversion(10);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour < 0){
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if(milesPerHour < 0){
            System.out.println("Invalid Value");
            return;
        }
        System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
    }
}
