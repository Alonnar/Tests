package uiobjects.pages;

import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.core.interfaces.common.ITextField;
import entities.SearchUser;
import org.openqa.selenium.support.FindBy;

/**
 * Created by student on 28.02.2017.
 */
public class Search extends com.epam.jdi.uitests.web.selenium.elements.composite.Form<SearchUser> {

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[3]/div[3]/div[1]/div/input")
    private ITextField name;








    @FindBy(xpath = "/html/body/div[1]/div[3]/div[3]/div[3]/div[3]/button[1]")
    private IButton button;

    @Override
    public void submit(SearchUser SearchUser) {
        button.click();
        super.submit(SearchUser);
    }
}

