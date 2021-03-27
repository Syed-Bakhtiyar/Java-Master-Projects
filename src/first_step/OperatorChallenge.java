package first_step;

public class OperatorChallenge {
    public static void main(String[] args) {
        double value1 = 20.00;
        double value2 = 80.00;
        double total = (value1 + value2) * 100.00;
        double reminderOfTotal = total % 40.00;

        boolean isTotalHasReminder = reminderOfTotal == 0 ? true : false;
        System.out.println("Is Total has reminder: " + isTotalHasReminder);

        if(!isTotalHasReminder){
            System.out.println("Got some reminders");
        }

    }
}
