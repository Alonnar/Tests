package factaries;

import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.core.interfaces.common.ITextField;
import entities.UID;
import org.openqa.selenium.support.FindBy;

/**
 * Created by student on 10.02.2017.
 */
public class Search extends com.epam.jdi.uitests.web.selenium.elements.composite.Form<UID> {
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[3]/div[2]/div/div[1]/div[1]/div/input")
    private ITextField uid;
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[3]/div[2]/div/div[6]/button[1]")
    private IButton button;

    //   private IButton loginButton;
    @Override
    public void submit(UID uid) {
        button.click();
        super.submit(uid);
    }
}
