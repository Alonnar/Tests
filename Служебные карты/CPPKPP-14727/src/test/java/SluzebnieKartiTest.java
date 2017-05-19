import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.lang.reflect.Method;

import static uiobjects.ADMsite.homePage;
import static uiobjects.ADMsite.loginPage;

/**
 * Created by student on 10.02.2017.
 */
public class SluzebnieKartiTest extends InitTest {

    @BeforeMethod
    public void before(Method method) throws IOException {
        homePage.isOpened();
    }

    @Test
    public void loginformTest(){
        loginPage.isOpened();
    }



    @Test
    public void LoginForm(){
        loginPage.open();
    }
}