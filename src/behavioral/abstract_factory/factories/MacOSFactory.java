package behavioral.abstract_factory.factories;

import behavioral.abstract_factory.buttons.Button;
import behavioral.abstract_factory.buttons.MacOSButton;
import behavioral.abstract_factory.checkboxes.Checkbox;
import behavioral.abstract_factory.checkboxes.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new MacOSCheckbox();
    }
}
