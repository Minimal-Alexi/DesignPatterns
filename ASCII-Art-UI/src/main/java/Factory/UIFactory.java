package Factory;

import UI_Classes.Button;
import UI_Classes.CheckBox;
import UI_Classes.TextField;

public abstract class UIFactory {
    public abstract Button createButton(String text);
    public abstract TextField createTextField(String text);
    public abstract CheckBox createCheckBox(String text);
}
