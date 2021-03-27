package expressions_statements_codeBlocks_methods;

public class If_Else_ControlExample {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your Final Score Was: " + finalScore);
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your Final Score Was: " + finalScore);
        }


    }
}
