package UI_Classes;

public abstract class Button extends UIObject{

    public Button(String text) {
        super(text);
    }

    public abstract void display();
}
