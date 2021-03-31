package arrays.introduction;

import java.util.Scanner;

public class FindMin {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int[] array = readElements(readInteger());
        int min = findMin(array);
        System.out.println("min = " + min);
    }

    private static int readInteger(){
        System.out.println("Enter count: ");
        return scanner.nextInt();
    }

    private static int[] readElements(int count){
        int[] integerArray = new int[count];
        for(int i=0; i< integerArray.length; i++){
            System.out.println("Enter a number: ");
            integerArray[i] = scanner.nextInt();
            scanner.nextLine();
        }
        scanner.close();
        return integerArray;
    }

    private static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++){
            if(min > array[i]){
                min = array[i];
            }
        }
        return min;
    }
}
