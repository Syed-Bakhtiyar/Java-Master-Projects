package control_flow_statement;

public class SwitchStatement {
    public static void main(String[] args) {
        int switchValue = 3;

        switch (switchValue){
            case 1:
                System.out.println("Value is: " + switchValue);
                break;
            case 2:
                System.out.println("Value is: " + switchValue);
                break;
            case 3: case 4: case 5:
                System.out.println("value is 3, 4 or 5");
                break;
            default:
                System.out.println("Value is neither 1 or 2");
        }


        char charValue = 'F';

        switch (charValue){
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("Value found from A, B, C, D and E is: " + charValue);
                break;
            default:
                System.out.println("Not Types A, B, C, D Or E");
        }
    }
}
