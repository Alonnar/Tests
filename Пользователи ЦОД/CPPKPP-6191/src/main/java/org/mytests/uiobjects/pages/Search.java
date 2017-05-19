package org.mytests.uiobjects.pages;

import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.core.interfaces.common.ITextField;
import com.epam.jdi.uitests.web.selenium.elements.composite.*;
import org.mytests.Entities.SearchUser;
import org.mytests.Entities.UserC;
import org.openqa.selenium.support.FindBy;

/**
 * Created by student on 07.02.2017.
 */
public class Search extends com.epam.jdi.uitests.web.selenium.elements.composite.Form<SearchUser> {
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[3]/div/div[2]/div/div[1]/input")
    private ITextField name;
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[3]/div/div[2]/div/div[2]/button[1]")
    private IButton button;

    //   private IButton loginButton;
    @Override
    public void submit(SearchUser SearchUser) {
        button.click();
        super.submit(SearchUser);
    }
}
