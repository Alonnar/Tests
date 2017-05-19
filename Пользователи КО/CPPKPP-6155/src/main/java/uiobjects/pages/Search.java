package uiobjects.pages;

import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.core.interfaces.common.ITextField;
import entities.SearchUser;
import entities.User;
import org.openqa.selenium.support.FindBy;

/**
 * Created by student on 20.02.2017.
 */
public class Search extends com.epam.jdi.uitests.web.selenium.elements.composite.Form<SearchUser> {
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[9]/div[2]/div/div[2]/div[1]/div[1]/div/div/input")
    private ITextField id;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[9]/div[2]/div/div[2]/div[1]/div[2]/div/table/tbody/tr[1]/td[1]/input")
    private IButton button;

    @Override
    public void submit(SearchUser searchUserser) {
        button.click();
        super.submit(searchUserser);
    }
}
