package generating.abstract_factory;

import generating.abstract_factory.buttons.Button;
import generating.abstract_factory.checkboxes.Checkbox;
import generating.abstract_factory.factories.GUIFactory;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckBox();
    }
    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
