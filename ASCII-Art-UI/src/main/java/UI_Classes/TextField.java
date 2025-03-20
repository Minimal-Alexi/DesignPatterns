package UI_Classes;

public abstract class TextField extends UIObject{
    public TextField(String text) {
        super(text);
    }

    public abstract void display();
}
