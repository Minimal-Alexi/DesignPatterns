public class Main {
    public static void main(String[] args) {
        Printer printer = new BasePrinter();
        printer.print("Hello World!");

        Printer printer2 = new EncryptedPrinter(new XMLPrinter(new BasePrinter()));
        printer2.print("Hello World!");

        Printer printer3 = new EncryptedPrinter(new BasePrinter());
        printer3.print("Hello World!");

    }
}
