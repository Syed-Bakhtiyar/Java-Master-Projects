package expressions_statements_codeBlocks_methods;

public class MegaBytesConverterExcercise {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
            return;
        }
        System.out.println(kiloBytes + " KB = " + ( kiloBytes/1024 ) + " MB and " + (kiloBytes % 1024)  + " KB" );
    }
}
