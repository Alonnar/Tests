import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.lang.reflect.Method;

import static uiobjects.ADMsite.homePage;

/**
 * Created by student on 20.02.2017.
 */
public class SluzebnieKartiTest extends InitTest {

    @BeforeMethod
    public void before(Method method) throws IOException {
        homePage.isOpened();
    }
}
