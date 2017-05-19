package org.mytests.tests;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import com.epam.web.matcher.verify.Verify;
import org.mytests.Entities.User;
import org.mytests.uiobjects.EpamSite;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import static com.epam.jdi.uitests.core.settings.JDISettings.logger;
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
        contactForm.mouseOver();
        delClick.doubleClick();
        delClick2.clickCenter();

    }


    @AfterMethod
    public void tearDown() {
        Verify.getFails();
    }
}
