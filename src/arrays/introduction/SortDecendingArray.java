package arrays.introduction;

import java.util.Arrays;
import java.util.Scanner;

public class SortDecendingArray {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myArray = getIntegers(5);
        printArray(myArray);
        sortIntegers(myArray);
        sortedArrayWithForNestedLoop(myArray);
//        int count = 0;
//        for (int i = 0; i < myArray.length; i++){
//            for (int j = i+1; j < myArray.length; j++){
//                count++;
//                if(myArray[i] < myArray[j]){
//                    int temp = myArray[j];
//                    myArray[j] = myArray[i];
//                    myArray[i] = temp;
//                }
//            }
//        }

//        System.out.println(Arrays.toString(myArray) + " iteration cost: " + count);
    }

    private static int[] getIntegers(int capacity){
        int[] myIntegerArray = new int[capacity];
        for (int i=0; i < myIntegerArray.length; i++){
            myIntegerArray[i] = scanner.nextInt();
        }
        scanner.close();
        return myIntegerArray;
    }

    private static void printArray(int[] array){
        for(int i=0; i < array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    private static int[] sortIntegers(int[] array){
        int[] sortedArray = Arrays.copyOf(array, array.length);
//        for(int i=0; i<sortedArray.length; i++){
//            sortedArray[i] = array[i];
//        }

        int count = 0;
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for (int i = 0; i < sortedArray.length -1; i++){
                count++;
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }

        System.out.println(Arrays.toString(sortedArray) + " iteration cost using while loop: " + count);

        return sortedArray;
    }

    private static int[] sortedArrayWithForNestedLoop(int[] myArray){
        // efficient
        int count = 0;
        for (int i = 0; i < myArray.length; i++){
            for (int j = i+1; j < myArray.length; j++){
                count++;
                if(myArray[i] < myArray[j]){
                    int temp = myArray[j];
                    myArray[j] = myArray[i];
                    myArray[i] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(myArray) + " iteration cost: " + count);
        return myArray;
    }
}
