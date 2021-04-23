package exceptions_example.introductions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Introduction {
    public static void main(String[] args) {
//        int x = 98;
//        int y = 0;
//        System.out.println(divideLBYL(x, y));
//        System.out.println(divideEAFP(x, y));
//        System.out.println(divide(x, y));
//
//        // this line will not be execute because of exception occured
//        System.out.println(divideEAFP(x, y));
        int x = getIntEAFP();
        System.out.println("X is: " + x);
    }

    private static int getInt(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int getIntLBYL(){
        Scanner scanner = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Please inter an integer");
        String input = scanner.next();
        for(int i = 0; i < input.length(); i++){
            if(!Character.isDigit(input.charAt(i))){
                isValid = false;
                break;
            }
        }
        if(isValid){
            return Integer.parseInt(input);
        }
        return 0;
    }

    private static int getIntEAFP(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please inter an integer");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e){
            return 0;
        }
    }

    private static int divideLBYL(int x, int y){
        if(y != 0){
            return x / y;
        }
        return 0;
    }

    private static int divideEAFP(int x, int y){
        try{
            return x / y;
        } catch (ArithmeticException e){
            return 0;
        }
    }

    private static int divide(int x, int y){
        return x / y;
    }
}
