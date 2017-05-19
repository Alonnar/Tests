package uiobjects.pages;

import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.core.interfaces.common.ITextField;
import entities.AddUser;
import org.openqa.selenium.support.FindBy;

/**
 * Created by student on 20.02.2017.
 */
public class Add extends com.epam.jdi.uitests.web.selenium.elements.composite.Form<AddUser> {

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[6]/div[2]/div/div[2]/div[1]/div[9]/div/input")
    private ITextField commentaries;








    @FindBy(xpath = "/html/body/div[1]/div[3]/div[6]/div[2]/div/div[2]/div[2]/button[2]")
    private IButton button;

    //   private IButton loginButton;
    @Override
    public void submit(AddUser AddUser) {
        button.click();
        super.submit(AddUser);
    }
}
