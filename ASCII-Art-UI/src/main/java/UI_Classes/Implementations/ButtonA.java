package UI_Classes.Implementations;

import UI_Classes.Button;

public class ButtonA extends Button {

    public ButtonA(String text)
    {
        super.text = text;
    }

    @Override
    public void display() {
        drawLine();
        System.out.println("|" + text + "|");
        drawLine();
    }
    private void drawLine()
    {
        System.out.print(".");
        for(int i = 0; i < text.length(); i++)
        {
            System.out.print("_");
        }
        System.out.println(".");
    }
}
