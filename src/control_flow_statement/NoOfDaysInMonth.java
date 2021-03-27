package control_flow_statement;

public class NoOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(2, 2021));
    }

    private static boolean isLeapYear(int year) {
        if( year < 1 || year > 9999){
            return false;
        }
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            return true;
        }
        return false;
    }

    private static int getDaysInMonth(int month, int year) {
        int noOfDays = 0;
        if(month < 1 || month > 12 || year < 1 || year > 9999){
            return -1;
        }

        switch (month){
            case 1:
                noOfDays = 31;
                break;
            case 2:
                noOfDays = isLeapYear(year) ? 29 : 28;
                break;
            case 3:
                noOfDays = 31;
                break;
            case 4:
                noOfDays = 30;
                break;
            case 5:
                noOfDays = 31;
                break;
            case 6:
                noOfDays = 30;
                break;
            case 7:
                noOfDays = 31;
                break;
            case 8:
                noOfDays = 31;
                break;
            case 9:
                noOfDays = 30;
                break;
            case 10:
                noOfDays = 31;
                break;
            case 11:
                noOfDays = 30;
                break;
            case 12:
                noOfDays = 31;
                break;

        }

        return noOfDays;
    }
}
