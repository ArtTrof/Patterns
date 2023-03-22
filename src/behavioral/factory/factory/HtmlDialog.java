package behavioral.factory.factory;

import behavioral.factory.buttons.Button;
import behavioral.factory.buttons.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
