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
        homePage.open();
        login.login(User.DEFAULT); // авторизация на сайте
        Verify.getFails();
        logger.info("Run Tests");
        userKO.open(); //открытие раздела "Пользователи КО"
         clickB1.clickCenter();
         clickADDUser.clickCenter(); //нажатие кнопки "Добавить пользователя"
        add.login(AddUser.DEFAULT);//заполнение формы пользователя
        clickB4.clickCenter();//
        clickB5.clickCenter(); //сохранения пользователя и добавление роли
        clickB2.clickCenter();//
        clickonsave.clickCenter();//




}


    @AfterMethod
    public void tearDown() {
        Verify.getFails();
    }
}
