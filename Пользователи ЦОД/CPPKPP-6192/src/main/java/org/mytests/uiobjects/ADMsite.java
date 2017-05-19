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
public class ADMsite extends WebSite {

    @JPage(url = "/Account/Login?ReturnUrl=%2fADM.WebSite", title = "Login page")
    public static LoginPage loginPage;

    @FindBy(css = ".uui-profile-menu")
    public static Login login;

    @JPage(url = "/", title = "Главная")
    public static HomePage homePage;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[4]/div[2]/table/tbody/tr[1]/td[1]/div/span[2]")
    public static ContactForm contactForm;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[4]/div[2]/table/tbody/tr[1]/td[1]")
    public static ContactForm contactForm1;
    @JPage(url = "/Security/Users", title = "Users")
    public static UsersPage usersPage;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[5]/div[2]/div/div[2]")
    public static Form form;

    @FindBy(css ="content-buttons-group")
    public static Search search;

    @FindBy(id = "loginForm")
    public static LoginPage.User loginForm;



}