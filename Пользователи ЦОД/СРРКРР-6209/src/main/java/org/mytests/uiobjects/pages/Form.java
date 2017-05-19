package org.mytests.uiobjects.pages;

import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.core.interfaces.common.ITextField;
import org.mytests.Entities.UserC;
import org.openqa.selenium.support.FindBy;

/**
 * Created by student on 06.02.2017.
 */
public class Form extends com.epam.jdi.uitests.web.selenium.elements.composite.Form<UserC> {
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[5]/div[2]/div/div[2]/div[1]/div[1]/div/input")
    private ITextField username;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[5]/div[2]/div/div[2]/div[1]/div[2]/div[1]/div/input")
    private ITextField password;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[5]/div[2]/div/div[2]/div[1]/div[2]/div[2]/div/input")
    private ITextField RepeatPass;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[5]/div[2]/div/div[2]/div[1]/div[3]/div/input")
    private ITextField LastName;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[5]/div[2]/div/div[2]/div[1]/div[4]/div/input")
    private ITextField FirstName;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[5]/div[2]/div/div[2]/div[1]/div[5]/div/input")
    private ITextField Ot;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[5]/div[2]/div/div[2]/div[1]/div[6]/div/input")
    private ITextField email;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[5]/div[2]/div/div[2]/div[1]/div[7]/div[1]/div/div/input")
    private ITextField data;


    @FindBy(xpath = "/html/body/div[1]/div[3]/div[5]/div[2]/div/div[2]/div[2]/button[2]")
    private IButton button;

    @Override
    public void submit(UserC userC) {

        button.click();
        super.submit(userC);
    }
}
