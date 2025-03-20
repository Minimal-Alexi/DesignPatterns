import Factory.Implementations.UIFactoryB;
import Factory.UIFactory;
import Factory.Implementations.UIFactoryA;
import UI_Classes.*;
import UI_Classes.Button;
import UI_Classes.TextField;

public class Main {
    public static void main(String[] args) {
        UIFactory uiFactoryA,uiFactoryB;
        Button buttonA,buttonB;
        TextField textFieldA,textFieldB;
        CheckBox checkboxA,checkboxB;

        // A Objects
        System.out.println("A UI Elements");
        uiFactoryA = new UIFactoryA();
        buttonA = uiFactoryA.createButton("ButtonA");
        buttonA.display();
        textFieldA = uiFactoryA.createTextField("TextFieldA");
        textFieldA.display();
        checkboxA = uiFactoryA.createCheckBox("CheckBoxA");
        checkboxA.display();

        // B Objects
        System.out.println("\nB UI Elements");
        uiFactoryB = new UIFactoryB();
        buttonB = uiFactoryB.createButton("ButtonB");
        buttonB.display();
        textFieldB = uiFactoryB.createTextField("TextFieldB");
        textFieldB.display();
        checkboxB = uiFactoryB.createCheckBox("CheckBoxB");
        checkboxB.display();
    }
}
