package UI_Classes;

public class ButtonA extends Button{

    public ButtonA(String text)
    {
        super.text = text;
    }

    @Override
    public void display() {
        drawWidth();
        System.out.println("|" + text + "|");
    }
    private void drawWidth()
    {
        int length = 2 + text.length();
        System.out.print(".");
        for(int i = 0; i < length; i++)
        {
            System.out.print("_");
        }
        System.out.println(".");
    }
}
