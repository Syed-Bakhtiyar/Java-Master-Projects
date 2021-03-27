package control_flow_statement;

public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(2);
    }

    public static void printSquareStar(int number){
        if(number < 5){
            System.out.println("Invalid Value");
            return;
        }
        String pattern = "";
        for(int i = 0; i < number; i++){
            for (int j = 0; j < number; j++){
                if (i == 0 || j == 0 || i == j || i == number - 1
                        || j == number - 1 || i + j == number - 1){
                    pattern += "*";
                } else {
                    pattern += " ";
                }
            }
            pattern += "\n";
        }
        System.out.println(pattern);
    }
}
