import com.epam.web.matcher.verify.Verify;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import entities.SearchUser;
import entities.User;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
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
        search.login(SearchUser.DEFAULT); //Ввод и поиск по фамилии
        clickB1.clickCenter();
        clickB2.setAttribute("selected", "3"); // Выбор роли
        searchyser.clickCenter(); //найти
        refresh.clickCenter(); //сброс
}


    @AfterMethod
    public void tearDown() {
        Verify.getFails();
    }
}
