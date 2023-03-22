package behavioral.abstract_factory.factories;

import behavioral.abstract_factory.buttons.Button;
import behavioral.abstract_factory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckBox();
}
