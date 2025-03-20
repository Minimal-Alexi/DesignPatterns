package Factory;

import UI_Classes.Button;
import UI_Classes.CheckBox;
import UI_Classes.TextField;

public abstract class UIFactory {
    public abstract Button createButton();
    public abstract TextField createTextField();
    public abstract CheckBox createCheckBox();
}
