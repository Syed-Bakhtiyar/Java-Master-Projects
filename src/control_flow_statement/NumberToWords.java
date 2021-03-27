package control_flow_statement;

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(9);
        System.out.println(getDigitCount(0));
    }

    public static void numberToWords(int number) {
        if(number < 0) {
            System.out.println("Invalid Value");
            return;
        }
        String inWord = "";
        int reversed = 0;
        int reversedNumber = reverse(number);
        int totalDigitsOfExactNumber = getDigitCount(number);
        int totalDigitOfReversedNumber = getDigitCount(reversedNumber);
        if(totalDigitsOfExactNumber == 1){
            switch (number){
                case 0:
                    inWord += "Zero ";
                    break;
                case 1:
                    inWord += "One ";
                    break;
                case 2:
                    inWord += "Two ";
                    break;
                case 3:
                    inWord += "Three ";
                    break;
                case 4:
                    inWord += "Four ";
                    break;
                case 5:
                    inWord += "Five ";
                    break;
                case 6:
                    inWord += "Six ";
                    break;
                case 7:
                    inWord += "Seven ";
                    break;
                case 8:
                    inWord += "Eight ";
                    break;
                case 9:
                    inWord += "Nine ";
                    break;
            }
            System.out.println(inWord);
            return;
        }
        while (reversedNumber != 0){
            int lastDigit = reversedNumber % 10;
            switch (lastDigit){
                case 0:
                    inWord += "Zero ";
                    break;
                case 1:
                    inWord += "One ";
                    break;
                case 2:
                    inWord += "Two ";
                    break;
                case 3:
                    inWord += "Three ";
                    break;
                case 4:
                    inWord += "Four ";
                    break;
                case 5:
                    inWord += "Five ";
                    break;
                case 6:
                    inWord += "Six ";
                    break;
                case 7:
                    inWord += "Seven ";
                    break;
                case 8:
                    inWord += "Eight ";
                    break;
                case 9:
                    inWord += "Nine ";
                    break;
            }
            reversed = (reversed * 10) + lastDigit;
            reversedNumber /= 10;
        }

        if(totalDigitOfReversedNumber != totalDigitsOfExactNumber){
            for(int i = 0; i < (totalDigitsOfExactNumber - totalDigitOfReversedNumber); i++){
                inWord += "Zero ";
            }
        }

        System.out.println(inWord);
    }

    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0){
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number = number/10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        if(number < 0){
            return -1;
        }
        if(number == 0){
            return 1;
        }
        int reverse = 0;
        int count = 0;
        while (number != 0){
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
            count++;
        }
        return count;
    }
}
