package org.mytests.uiobjects;

import com.epam.jdi.uitests.web.selenium.elements.complex.Menu;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;
import org.mytests.factaries.Click;
import org.mytests.uiobjects.pages.*;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Roman_Iovlev on 8/30/2015.
 */
@JSite(domain = "http://ADM.WebSite/")
public class EpamSite extends WebSite {

    @JPage(url = "/Account/Login?ReturnUrl=%2fADM.WebSite", title = "Login page")
    public static LoginPage loginPage;

    @FindBy(css = ".uui-profile-menu")
    public static Login login;

    @JPage(url = "/", title = "Главная")
    public static HomePage homePage;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[4]/div[2]/table/tbody/tr[1]/td[1]")
    public static ContactForm contactForm;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[4]/div[2]/table/tbody/tr[1]/td[1]/div/span[4]")
    public static Click delClick;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[8]/div[2]/div/div[3]/button[2]")
    public static Click delClick2;

    @JPage(url = "/Security/Users", title = "Users")
    public static UsersPage usersPage;





}