import com.epam.web.matcher.verify.Verify;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import com.google.common.io.Closer;
import entities.AddUser;
import entities.SearchUser;
import entities.User;
import net.sourceforge.htmlunit.corejs.javascript.tools.shell.QuitAction;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import uiobjects.ADMsite;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;

import java.io.Closeable;

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
         clickB1.mouseOver();
         clickB7.clickCenter();
        add.login(AddUser.DEFAULT);
        search.login(SearchUser.DEFAULT);






}


    @AfterMethod
    public void tearDown() {
        Verify.getFails();
    }
}
