package uiobjects.pages;

import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.core.interfaces.common.ITextField;
import entities.AddUser;
import org.openqa.selenium.support.FindBy;

/**
 * Created by student on 20.02.2017.
 */
public class Add extends com.epam.jdi.uitests.web.selenium.elements.composite.Form<AddUser> {
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[5]/div[2]/div/div[2]/div[1]/div[1]/div/input")
    private ITextField LastName;
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[5]/div[2]/div/div[2]/div[1]/div[2]/div/input")
    private ITextField FirstName;
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[5]/div[2]/div/div[2]/div[1]/div[3]/div/input")
    private ITextField SecondName;
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[5]/div[2]/div/div[2]/div[1]/div[4]/div/input")
    private ITextField SecretWord;
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[5]/div[2]/div/div[2]/div[1]/div[5]/div/input")
    private ITextField Email;
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[5]/div[2]/div/div[2]/div[1]/div[6]/div/input")
    private ITextField phone;
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[5]/div[2]/div/div[2]/div[1]/div[7]/div[1]/div/div/input")
    private ITextField firstdata;
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[5]/div[2]/div/div[2]/div[1]/div[7]/div[2]/div/div/input")
    private ITextField lastdata;
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[5]/div[2]/div/div[2]/div[1]/div[8]/div/input")
    private ITextField commentaries;








    @FindBy(xpath = "/html/body/div[1]/div[3]/div[5]/div[2]/div/div[2]/div[2]/button[2]")
    private IButton button;

    //   private IButton loginButton;
    @Override
    public void submit(AddUser AddUser) {
        button.click();
        super.submit(AddUser);
    }
}
