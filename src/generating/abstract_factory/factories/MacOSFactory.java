package generating.abstract_factory.factories;

import generating.abstract_factory.buttons.Button;
import generating.abstract_factory.buttons.MacOSButton;
import generating.abstract_factory.checkboxes.Checkbox;
import generating.abstract_factory.checkboxes.MacOSCheckbox;

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
