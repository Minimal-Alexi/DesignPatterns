package Factory;

import UI_Classes.Button;
import UI_Classes.CheckBox;
import UI_Classes.Implementations.ButtonA;
import UI_Classes.Implementations.CheckBoxA;
import UI_Classes.Implementations.TextFieldA;
import UI_Classes.TextField;

public class UIFactoryA extends UIFactory {
    public UIFactoryA() {

    }

    @Override
    public Button createButton(String text) {
        return new ButtonA(text);
    }
    @Override
    public TextField createTextField(String text) {
        return new TextFieldA(text);
    }
    @Override
    public CheckBox createCheckBox(String text) {
        return new CheckBoxA(text);
    }
}
