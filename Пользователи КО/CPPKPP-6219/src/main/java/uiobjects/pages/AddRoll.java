package uiobjects.pages;

import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.core.interfaces.common.ITextField;
import entities.AddRollUser;
import entities.AddUser;
import org.openqa.selenium.support.FindBy;

/**
 * Created by student on 28.02.2017.
 */
public class AddRoll extends com.epam.jdi.uitests.web.selenium.elements.composite.Form<AddRollUser> {
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[8]/div[2]/div/div[2]/div[1]/div[1]/div/input")
    private ITextField Name;
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[8]/div[2]/div/div[2]/div[1]/div[4]/div/div/input")
    private ITextField lastdata;
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[8]/div[2]/div/div[2]/div[1]/div[5]/div/input")
    private ITextField commentaries;









    @FindBy(xpath = "/html/body/div[1]/div[3]/div[8]/div[2]/div/div[2]/div[2]/button[2]")
    private IButton button;

    //   private IButton loginButton;
    @Override
    public void submit(AddRollUser AddRollUser) {
        button.click();
        super.submit(AddRollUser);
    }
}
