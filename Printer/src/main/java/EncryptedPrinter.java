public class EncryptedPrinter extends PrinterDecorator{
    public EncryptedPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String text) {
        String encryptedText = encrypt(text);
        super.print(encryptedText);
    }

    private String encrypt(String message) {
        int shift = 3;
        StringBuilder encrypted = new StringBuilder();
        for (char c : message.toCharArray()) {
            encrypted.append((char) (c + shift));
        }
        return encrypted.toString();
    }
}
