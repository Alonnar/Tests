import com.epam.web.matcher.verify.Verify;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import com.gargoylesoftware.htmlunit.javascript.host.event.KeyboardEvent;
import entities.CardsUser;
import entities.User;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import uiobjects.ADMsite;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;

import javax.security.auth.kerberos.KeyTab;
import java.util.concurrent.TimeUnit;

import static com.epam.jdi.uitests.core.settings.JDISettings.logger;
import static javafx.scene.input.KeyCode.DOWN;
import static javafx.scene.input.KeyCode.K;
import static javafx.scene.input.KeyCode.SOFTKEY_1;
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
        clickB1.clickCenter();
        createCard.login(CardsUser.DEFAULT);




        }

    @AfterMethod
    public void tearDown() {
        Verify.getFails();
    }
}
