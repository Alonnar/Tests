package Robot;

/**
 * Created by student on 24.04.2017.
 */
import com.epam.jdi.uitests.core.interfaces.common.ITextField;
import com.epam.jdi.uitests.web.selenium.elements.common.FileInput;
import org.openqa.selenium.By;

import static com.epam.jdi.uitests.web.robot.JRobot.pasteText;

/**
 * Text Field control implementation
 *
 * @author Alexeenko Yan
 * @author Shubin Konstantin
 * @author Zharov Alexandr
 */
public class RFileInput extends FileInput implements ITextField {
    public RFileInput() {
        super();
    }

    public RFileInput(By byLocator) {
        super(byLocator);
    }

    @Override
    protected void clearAction() {
    }
    @Override
    protected void inputAction(CharSequence text) {
        getWebElement().click();
        pasteText(text);
    }

}