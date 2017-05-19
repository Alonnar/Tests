package uiobjects;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;
import factaries.ClickB;
import org.openqa.selenium.support.FindBy;
import uiobjects.pages.*;

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

    @JPage(url = "http://192.168.0.112:91/ADM.WebSite/Security/UsersDevices")
    public static UserKO userKO;

    @FindBy(xpath = "/html/body/div[1]/div[3]")
    public static Add add;

    @FindBy(xpath = " /html/body/div[1]/div[3]/div[3]/div[3]")
    public static Search search;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[4]/div[2]/table/tbody/tr[3]/td[1]")
    public static ClickB clickB1;
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[4]/div[2]/table/tbody/tr[3]/td[1]/div/span[2]")
    public static ClickB clickB7;





}
