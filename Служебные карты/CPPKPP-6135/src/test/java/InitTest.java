import com.epam.web.matcher.verify.Verify;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import entities.UID;
import entities.User;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import uiobjects.ADMsite;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;

import java.nio.channels.SelectionKey;

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
        login.login(User.DEFAULT); //ввод логина и пароля для входа на сайт
        Verify.getFails();
        logger.info("Run Tests");
        serviceCard.open(); //открытие пункта "Служенбные карты"
        clickB1.clickCenter();
        search.login(UID.DEFAULT);
        clickB2.clickCenter(); //нажатие кнопки сброса




      


        }


    @AfterMethod
    public void tearDown() {
        Verify.getFails();
    }
}
