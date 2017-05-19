import com.epam.web.matcher.verify.Verify;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import entities.AddRollUser;
import entities.ChangeRollUser;
import entities.User;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import uiobjects.ADMsite;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import static com.epam.jdi.uitests.core.settings.JDISettings.logger;
import static uiobjects.ADMsite.*;
import static uiobjects.ADMsite.clickoncreaterole;

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
        Roli.open();
    clickoncreaterole.clickCenter();
        addRoll.login(AddRollUser.DEFAULT);
        clickB12.doubleClick();
    clickB12.clickCenter();

    clickB15.clickCenter();
   changeRoll.login(ChangeRollUser.DEFAULT);

    clickB12.doubleClick();
    clickB12.clickCenter();











}


    @AfterMethod
    public void tearDown() {
        Verify.getFails();
    }
}
