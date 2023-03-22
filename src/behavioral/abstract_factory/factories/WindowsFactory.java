package behavioral.abstract_factory.factories;

import behavioral.abstract_factory.buttons.Button;
import behavioral.abstract_factory.buttons.WindowsButton;
import behavioral.abstract_factory.checkboxes.Checkbox;
import behavioral.abstract_factory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new WindowsCheckbox();
    }
}
