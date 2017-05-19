package org.mytests.uiobjects.pages;

import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.core.interfaces.common.ITextField;
import org.mytests.Entities.UserC;
import org.openqa.selenium.support.FindBy;

/**
 * Created by student on 06.02.2017.
 */
public class Form extends com.epam.jdi.uitests.web.selenium.elements.composite.Form<UserC> {

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[6]/div[2]/div/div[2]/div[1]/div[2]/div/input")
    private ITextField LastName;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[6]/div[2]/div/div[2]/div[2]/button[2]")
    private IButton button;

    @Override
    public void submit(UserC userC) {

      // if (waitDisplayedAction(20))

        button.click();
        super.submit(userC);
    }
}
