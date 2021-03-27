package expressions_statements_codeBlocks_methods;

public class MinutesToYearAndDaysExcercise {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if(minutes < 0){
            System.out.println("Invalid Value");
            return;
        }
        long year = minutes / 525600;
        long day = minutes / 1440;
        long remainingDays = day % 365;
        System.out.println(minutes + " min = " + year + " y and " + remainingDays + " d" );
    }
}
