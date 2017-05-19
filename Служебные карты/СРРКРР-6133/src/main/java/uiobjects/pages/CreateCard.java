package uiobjects.pages;

import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.core.interfaces.common.ITextField;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import entities.CardsUser;
import entities.User;
import org.openqa.selenium.support.FindBy;

/**
 * Created by student on 15.02.2017.
 */
public class CreateCard extends Form<CardsUser> {
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[6]/div[2]/div/div[2]/div[1]/input")
    private ITextField serialNumber;
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[6]/div[2]/div/div[2]/div[2]/div[1]/div[2]/div/span[2]/input")
    private ITextField user;
  //  @FindBy(xpath = "/html/body/div[1]/div[3]/div[6]/div[2]/div/div[2]/div[3]/div/input")
  //  private ITextField firstData;
   /* @FindBy(xpath = "/html/body/div[1]/div[3]/div[6]/div[2]/div/div[2]/div[6]/button[2]")


    private IButton button;
    //   private IButton loginButton;
    //
    @Override
    public void submit(CardsUser CardsUser) {
        button.click();
        super.submit(CardsUser);
    }*/
}
