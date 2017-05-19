import com.epam.web.matcher.verify.Verify;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import entities.AddUser;
import entities.SearchUser;
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
        homePage.open(); //открытие главной страницы
        login.login(User.DEFAULT); //осуществоление входа на сайт
        Verify.getFails();
        logger.info("Run Tests");
        userKO.open(); //открытие страницы с пользователямиКО
        clickOnButtonAdd.clickCenter(); //Клик мыщи по кнопке "Добавить"
        clickinput.clickCenter();
        add.login(AddUser.DEFAULT); //Заполнение формы
        search.login(SearchUser.DEFAULT);//Поиск пользователя в системе




}


    @AfterMethod
    public void tearDown() {
        Verify.getFails();
    }
}
