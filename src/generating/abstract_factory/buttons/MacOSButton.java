package generating.abstract_factory.buttons;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is a MacOS variant of a button.
 */
public class MacOSButton implements Button{
    @Override
    public void paint() {
        System.out.println("mac os button created");
    }
}
