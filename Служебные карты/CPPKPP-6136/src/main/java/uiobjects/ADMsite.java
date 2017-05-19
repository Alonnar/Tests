package uiobjects;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;
import factaries.ClickB1;
import org.openqa.selenium.support.FindBy;
import uiobjects.pages.HomePage;
import uiobjects.pages.Login;
import uiobjects.pages.LoginPage;
import uiobjects.pages.ServiceCard;

/**
 * Created by student on 10.02.2017.
 */
@JSite(domain = "http://192.168.0.112:91/ADM.WebSite/")
public class ADMsite extends WebSite {

    @JPage(url = "/Account/Login?ReturnUrl=%2fADM.WebSite", title = "Login page")
    public static LoginPage loginPage;

    @FindBy(css = ".uui-profile-menu")
    public static Login login;

    @JPage(url = "/", title = "Главная")
    public static HomePage homePage;

    @JPage(url = "http://192.168.0.112:91/ADM.WebSite/Security/SecurityCards")
    public static ServiceCard serviceCard;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[9]/div/div[3]/table/thead/tr/th[2]/div[1]")
    public static ClickB1 clickB1;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[9]/div/div[3]/table/thead/tr/th[3]/div[1]")
    public static ClickB1 clickB2;

}
