package generating.abstract_factory.factories;

import generating.abstract_factory.buttons.Button;
import generating.abstract_factory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckBox();
}
