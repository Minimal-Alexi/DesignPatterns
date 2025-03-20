package UI_Classes.Implementations;

import UI_Classes.Button;

public class ButtonB extends Button {

    public ButtonB(String text)
    {
        super(text);
    }

    @Override
    public void display() {
        drawLine();
        System.out.println("*" + super.text + "*");
        drawLine();
    }
    private void drawLine()
    {
        System.out.print("*");
        for(int i = 0; i < super.text.length(); i++)
        {
            System.out.print("*");
        }
        System.out.println("*");
    }
}
