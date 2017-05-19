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


    @FindBy(css = ".uui-profile-menu")
    public static Login login;

    @JPage(url = "/", title = "Главная")
    public static HomePage homePage;


    @JPage(url = "http://192.168.0.112:91/ADM.WebSite/Security/Roles")
    public static Roli Roli;


    @FindBy(xpath = "/html/body/div[1]/div[3]/div[8]/div[2]/div/div[2]")
    public static AddRoll addRoll;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[6]/button")
    public static ClickB clickoncreaterole;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[3]/button[1]")
    public static ClickB clickB12;


















}
