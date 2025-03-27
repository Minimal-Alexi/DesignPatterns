public class XMLPrinter  extends PrinterDecorator{
    public XMLPrinter(Printer printer) {
        super(printer);
    }
    @Override
    public void print(String text) {
        System.out.println("<message>");
        super.print(text);
        System.out.println("</message>");
    }
}
