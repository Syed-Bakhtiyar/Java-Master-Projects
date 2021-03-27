package expressions_statements_codeBlocks_methods;

public class CatPlayingExcercise {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }

    public static boolean isCatPlaying(boolean summer, int temprature){
        if(summer){
            return temprature >= 25 && temprature <= 45;
        }
        return temprature >= 25 && temprature <=35;
    }
}
