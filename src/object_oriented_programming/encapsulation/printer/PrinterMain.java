package object_oriented_programming.encapsulation.printer;

public class PrinterMain {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println("Initial Page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted() );
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted() );
    }
}
