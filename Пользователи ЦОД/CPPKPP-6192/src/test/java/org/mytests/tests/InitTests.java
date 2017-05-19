package org.mytests.tests;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import com.epam.web.matcher.verify.Verify;
import org.mytests.Entities.SearchUser;
import org.mytests.Entities.User;
import org.mytests.Entities.UserC;
import org.mytests.uiobjects.ADMsite;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import static com.epam.jdi.uitests.core.settings.JDISettings.logger;
import static org.mytests.uiobjects.ADMsite.*;

/**
 * Created by Roman_Iovlev on 7/13/2015.
 */
public class InitTests extends TestNGBase {

    @BeforeSuite(alwaysRun = true)
    public static void setUp() throws Exception {
        WebSite.init(ADMsite.class);
        homePage.open();
        login.login(User.DEFAULT);
        Verify.getFails();
        logger.info("Run Tests");
        usersPage.open();
        contactForm1.mouseOver();
        contactForm.clickCenter();
        form.login(UserC.DEFAULT);
        search.login(SearchUser.DEFAULT);

    }


    @AfterMethod
    public void tearDown() {
        Verify.getFails();
    }
}
