package org.mytests.tests;

import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import com.epam.web.matcher.verify.Verify;
import javafx.scene.control.ButtonType;
import org.mytests.Entities.User;
import org.mytests.Entities.UserC;
import org.mytests.uiobjects.EpamSite;
import org.mytests.uiobjects.pages.Search;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import java.awt.*;

import static com.epam.jdi.uitests.core.settings.JDISettings.logger;
import static com.sun.jna.platform.unix.X11.Button2;
import static org.mytests.uiobjects.EpamSite.*;

/**
 * Created by Roman_Iovlev on 7/13/2015.
 */
public class InitTests extends TestNGBase {

    @BeforeSuite(alwaysRun = true)
    public static void setUp() throws Exception {
        WebSite.init(EpamSite.class);
        homePage.open();
        login.login(User.DEFAULT);
        Verify.getFails();
        logger.info("Run Tests");
        usersPage.open();
        search.login(UserC.DEFAULT);
        searchButton.clickCenter();




    }


    @AfterMethod
    public void tearDown() {
        Verify.getFails();
    }
}
