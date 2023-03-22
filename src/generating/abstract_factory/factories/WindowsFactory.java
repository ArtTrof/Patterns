package generating.abstract_factory.factories;

import generating.abstract_factory.buttons.Button;
import generating.abstract_factory.buttons.WindowsButton;
import generating.abstract_factory.checkboxes.Checkbox;
import generating.abstract_factory.checkboxes.WindowsCheckbox;

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
