package org.mytests.uiobjects;

import com.epam.jdi.uitests.web.selenium.elements.complex.Menu;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;
import org.mytests.uiobjects.pages.*;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Roman_Iovlev on 8/30/2015.
 */
@JSite(domain = "http://ADM.WebSite/")
public class ADMSite extends WebSite {

    @JPage(url = "/Account/Login?ReturnUrl=%2fADM.WebSite", title = "Login page")
    public static LoginPage loginPage;

    @FindBy(css = ".uui-profile-menu")
    public static Login login;

    @JPage(url = "/", title = "Главная")
    public static HomePage homePage;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[3]/div/div[1]/button")
    public static ContactForm contactForm;
    @JPage(url = "/Security/Users", title = "Users")
    public static UsersPage usersPage;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[5]/div[2]/div/div[2]")
    public static Form form;

    @FindBy(id = "loginForm")
    public static LoginPage.User loginForm;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[5]/div[2]/div/div[2]/div[2]/button[2]")
    public static Form click;
@FindBy(xpath = "/html/body/div[1]/div[3]/div[4]/div[2]/table/tbody/tr[1]/td[2]/input")
public static Form clickrole;
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[3]/div/div[3]/button[1]")
    public static Form clicksave;



}