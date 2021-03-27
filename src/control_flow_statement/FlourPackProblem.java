package control_flow_statement;

public class FlourPackProblem {
    public static void main(String[] args) {
        System.out.println(canPack(1,0,5));
    }
                                      // 5kg        1kg each bag    amount of kilo needed
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        bigCount *= 5;
        if (bigCount + smallCount >= goal) {
            if (smallCount >= goal % 5) {
                return true;
            }
        }
        return false;
    }
}
