package generating.factory;

import generating.factory.factory.Dialog;
import generating.factory.factory.HtmlDialog;
import generating.factory.factory.WindowsDialog;

public class Demo {
    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    private static Dialog dialog;

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * All of the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
