import UI_Classes.Implementations.ButtonA;
import UI_Classes.Implementations.CheckboxA;
import UI_Classes.Implementations.TextFieldA;

public class Main {
    public static void main(String[] args) {
        ButtonA buttonA = new ButtonA("LMAO");
        buttonA.display();
        CheckboxA checkboxA = new CheckboxA("LMAO");
        checkboxA.display();
        TextFieldA textFieldA = new TextFieldA("LMAO");
        textFieldA.display();
    }
}
