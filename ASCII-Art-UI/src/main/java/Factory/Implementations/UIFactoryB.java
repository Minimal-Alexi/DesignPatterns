package Factory.Implementations;

import Factory.UIFactory;
import UI_Classes.Button;
import UI_Classes.CheckBox;
import UI_Classes.Implementations.ButtonB;
import UI_Classes.Implementations.CheckBoxB;
import UI_Classes.Implementations.TextFieldB;
import UI_Classes.TextField;

public class UIFactoryB extends UIFactory {
    public UIFactoryB() {

    }

    @Override
    public Button createButton(String text) {
        return new ButtonB(text);
    }
    @Override
    public TextField createTextField(String text) {
        return new TextFieldB(text);
    }
    @Override
    public CheckBox createCheckBox(String text) {
        return new CheckBoxB(text);
    }
}
