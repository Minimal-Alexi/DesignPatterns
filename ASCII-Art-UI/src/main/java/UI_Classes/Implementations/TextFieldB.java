package UI_Classes.Implementations;

import UI_Classes.TextField;

public class TextFieldB extends TextField {
    public TextFieldB(String text) {
        super.text = text;
    }

    @Override
    public void display(){
        drawLine();
        System.out.println("*Please input text:`" + text + "`*");
        drawLine();
    }
    private void drawLine()
    {
        System.out.print("*");
        for(int i = 0; i < text.length() + 20; i++)
        {
            System.out.print("*");
        }
        System.out.println("*");
    }
}
