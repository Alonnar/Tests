import com.epam.web.matcher.verify.Verify;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import entities.UID;
import entities.User;
import entities.editUser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import uiobjects.ADMsite;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;

import static com.epam.jdi.uitests.core.settings.JDISettings.logger;
import static uiobjects.ADMsite.*;

/**
 * Created by student on 10.02.2017.
 */
public class InitTest extends TestNGBase{

@BeforeSuite(alwaysRun = true)
public static void setUp() throws Exception {
        WebSite.init(ADMsite.class);
        homePage.open();
        login.login(User.DEFAULT);
        Verify.getFails();
        logger.info("Run Tests");
        serviceCard.open();
        clickB2.mouseOver();
        clickB1.clickCenter();
        search.login(UID.DEFAULT);
        clickB2.clickCenter();
       clickB3.clickCenter();
        edit.login(editUser.DEFAULT);



        }


    @AfterMethod
    public void tearDown() {
        Verify.getFails();
    }
}
