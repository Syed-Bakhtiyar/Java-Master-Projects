package expressions_statements_codeBlocks_methods;

public class SecondsMinutesOverloadingExample {
    public static void main(String[] args) {
        System.out.println(getDurationString(3600));
    }

    public static String getDurationString(int minutes, int seconds) {
        String invalidValue = "Invalid Value";
        if((minutes < 0) || (seconds < 0) || (seconds > 59)){
            return invalidValue;
        }

        int hour = minutes / 60;
        int remainingMinutes = minutes % 60;
        String hourString = hour < 10 ? "0" + hour + " h " : hour + " h ";
        String minuteString = minutes < 10 ? "0" + minutes + " m " : minutes + " m ";
        String secondString = seconds < 10 ? "0" + seconds + " s " : seconds + " s ";
        return hourString + minuteString + secondString;
    }

    public static String getDurationString(int seconds) {
        String invalidValue = "Invalid Value";
        if(seconds < 0){
            return invalidValue;
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }
}
