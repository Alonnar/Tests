package Robot;


import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

import static com.epam.commons.Timer.sleep;
import static com.epam.jdi.uitests.core.settings.JDISettings.exception;
import static java.awt.event.KeyEvent.*;

/**
 * Created by Roman_Iovlev on 9/7/2015.
 */
public final class JRobot {
    private JRobot() { }

    public static void pasteText(CharSequence text) {
        try {
            Robot robot;
            try {
                robot = new Robot();
            } catch (Exception ex) {
                throw exception("Can't instantiate Robot");
            }
            StringSelection stringSelection = new StringSelection(text.toString());
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, (clipboard1, contents) -> {
            });
            sleep(1000);
            robot.keyPress(VK_CONTROL);
            robot.keyPress(VK_V);
robot.keyPress(VK_DOWN);
            robot.keyRelease(VK_CONTROL);
            robot.keyPress(VK_ENTER);
            robot.keyRelease(VK_ENTER);
        } catch (Exception ex) {
            throw exception("Robot Input exception");
        }
    }
}
