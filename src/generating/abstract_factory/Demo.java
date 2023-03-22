package generating.abstract_factory;

import generating.abstract_factory.factories.GUIFactory;
import generating.abstract_factory.factories.MacOSFactory;
import generating.abstract_factory.factories.WindowsFactory;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {
    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
   private static Application configure() {
        Application application;
        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        application = new Application(factory);
        return application;
    }

    public static void main(String[] args) {
        Application app = configure();
        app.paint();
    }
}
