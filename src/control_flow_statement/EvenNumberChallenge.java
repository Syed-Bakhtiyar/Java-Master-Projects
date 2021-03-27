package control_flow_statement;

public class EvenNumberChallenge {
    public static void main(String[] args) {

        int number = 4;
        int finishNumber = 20;
        int count = 0;
        while (number <= finishNumber){
            number++;
            if(!isEven(number)){
                continue;
            }
            System.out.println("Even Number: " + number);
            count++;
            if(count == 5){
                break;
            }
        }

        System.out.println("Total even Numbers are: " + count);

    }

    public static boolean isEven(int number) {
        return (number % 2) == 0;
    }
}
