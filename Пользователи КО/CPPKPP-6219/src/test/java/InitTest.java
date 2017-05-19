import com.epam.web.matcher.verify.Verify;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import entities.AddRollUser;
import entities.AddUser;
import entities.User;
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
        userKO.open();
         clickB1.clickCenter();
         clickB3.clickCenter();
        add.login(AddUser.DEFAULT); //создание пользователя
        clickB4.doubleClick(); // сохранение результатов
        Roli.open(); //переход в Роли
        clickB7.clickCenter();
        clickB8.clickCenter();
        clickB9.clickCenter();
        clickB10.clickCenter();
        clickB11.clickCenter();
        addRoll.login(AddRollUser.DEFAULT);
        clickB12.clickCenter();
        clickB13.clickCenter();
        clickB14.clickCenter();
        clickB12.clickCenter();








}


    @AfterMethod
    public void tearDown() {
        Verify.getFails();
    }
}
