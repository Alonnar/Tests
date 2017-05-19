package factaries;

import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.core.interfaces.common.ITextField;
import entities.UID;
import entities.editUser;
import org.openqa.selenium.support.FindBy;

/**
 * Created by student on 13.02.2017.
 */
public class Edit extends com.epam.jdi.uitests.web.selenium.elements.composite.Form<editUser> {

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[3]/div[2]/div/div[4]/div[2]/div/div/input")
    private ITextField endData;
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[3]/div[2]/div/div[6]/button[1]")
    private IButton button;

    //   private IButton loginButton;
    @Override
    public void submit(editUser editUser) {
        button.click();
        super.submit(editUser);
    }
}
