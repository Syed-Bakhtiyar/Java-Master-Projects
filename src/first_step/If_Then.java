package first_step;

public class If_Then {
    public static void main(String[] args) {
        int result = 1 + 3; // 1 + 3 = 4
        System.out.println("result value is: " + result);

        result = result - 2;
        System.out.println("result has: " + result);

        result = result * 10;
        System.out.println("result has: " + result);

        result = result / 10;
        System.out.println("result has: " + result);

        // Abbrevating Operators
        result++;
        System.out.println("Result: " + result);

        result--;
        System.out.println("result: " + result);

        result += 2;
        System.out.println("result: " + result);

        result *= 10;
        System.out.println("result: " + result);

        result /= 2;
        System.out.println("result: " + result);

        result -= 16;
        System.out.println("result: " + result);

        boolean isAlien = false;
        if(isAlien == false)
            System.out.println("It is not an alien");

        if(!isAlien){
            System.out.println("It is an alien");
        }

        System.out.println(isAlien);
    }
}
