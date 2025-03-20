package UI_Classes.Implementations;

import UI_Classes.CheckBox;

public class CheckBoxB extends CheckBox {
    public CheckBoxB(String text) {
        super.text = text;
    }

    @Override
    public void display(){
        drawLine();
        System.out.println("*" + text + "* x *");
        drawLine();
    }
    private void drawLine()
    {
        System.out.print("*");
        for(int i = 0; i < text.length(); i++)
        {
            System.out.print("*");
        }
        System.out.println("*****");
    }
}
