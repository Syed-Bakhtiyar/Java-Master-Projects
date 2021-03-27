package expressions_statements_codeBlocks_methods;

public class MethodsChallenge1 {
    public static void main(String[] args) {
        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Bakhtiyar", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("John", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("John", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("John", position);
    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get the position " + position);
    }


    public static int calculateHighScorePosition(int score){
        if(score >= 1000){
            return 1;
        }

        // this is just for understanding we can remove after && expression
        if(score >= 500 && score < 1000){
            return 2;
        }

        if(score >= 100 && score < 500){
            return 3;
        }

        return 4;
    }
}
