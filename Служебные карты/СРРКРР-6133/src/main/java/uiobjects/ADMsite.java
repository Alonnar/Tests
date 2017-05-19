package uiobjects;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;
import com.sun.corba.se.impl.oa.poa.ActiveObjectMap;
import factaries.ClickB1;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.KeyUpAction;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;
import uiobjects.pages.*;

import java.security.Key;

/**
 * Created by student on 10.02.2017.
 */
@JSite(domain = "http://192.168.0.112:91/ADM.WebSite/")
public class ADMsite extends WebSite {

    @JPage(url = "/Account/Login?ReturnUrl=%2fADM.WebSite", title = "Login page")
    public static LoginPage loginPage;

    @FindBy(css = ".uui-profile-menu")
    public static Login login;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[6]/div[2]/div/div[2]")
    public static CreateCard createCard;


    @JPage(url = "/", title = "Главная")
    public static HomePage homePage;

    @JPage(url = "http://192.168.0.112:91/ADM.WebSite/Security/SecurityCards")
    public static ServiceCard serviceCard;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/button")
    public static ClickB1 clickB1;
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[6]/div[2]/div/div[2]/div[2]/div[1]/div[2]/div/span[2]/span")
    public static ClickB1 clickB2;



}
