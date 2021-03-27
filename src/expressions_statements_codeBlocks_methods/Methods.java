package expressions_statements_codeBlocks_methods;

public class Methods {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 8;
        int bonus = 100;
        int returnByMethodCall1 = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("returnByMethodCall1: " + returnByMethodCall1);

        score = 10000;
        levelCompleted = 15;
        bonus = 100;
        gameOver = false;
        int returnByMethodCall2 = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("returnByMethodCall2: " + returnByMethodCall2);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore = score + (levelCompleted * bonus);
        finalScore += 1000;
        if(gameOver){
            System.out.println("finalScore is: " + finalScore);
            return finalScore;
        }
        return -1;
    }
}
