import com.epam.web.matcher.verify.Verify;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
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
        homePage.open(); //Откртие главной старницы
        login.login(User.DEFAULT); //Авторизация
        Verify.getFails();
        logger.info("Run Tests");
        userKO.open(); //Переход на страницу с пользователями КО
         clickB1.clickCenter(); //нажатие кнопки добавить пользователя
        add.login(AddUser.DEFAULT); //заполнение формы
       clickB4.clickCenter();//установление роли
       clickB5.clickCenter();
        clickB2.clickCenter();
        clickB6.clickCenter();




}


    @AfterMethod
    public void tearDown() {
        Verify.getFails();
    }
}
