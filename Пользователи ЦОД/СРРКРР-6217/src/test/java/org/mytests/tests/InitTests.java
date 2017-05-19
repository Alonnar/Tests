package org.mytests.tests;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import com.epam.web.matcher.verify.Verify;
import org.mytests.Entities.AddRollUser;
import org.mytests.Entities.User;
import org.mytests.Entities.UserC;
import org.mytests.uiobjects.ADMSite;
import org.omg.CORBA.TIMEOUT;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

import static com.epam.jdi.uitests.core.settings.JDISettings.logger;
import static org.mytests.uiobjects.ADMSite.*;

/**
 * Created by Roman_Iovlev on 7/13/2015.
 */
public class InitTests extends TestNGBase {

    @BeforeSuite(alwaysRun = true)
    public static void setUp() throws Exception {
        WebSite.init(ADMSite.class);
        homePage.open(); //открытие главной страницы сайта
        login.login(User.DEFAULT); //авторизация
        Verify.getFails();
        logger.info("Run Tests");
        usersPage.open(); //открытие страницы "Пользователи КО"
        contactForm.clickCenter();
        form.login(UserC.DEFAULT); //Заполнение формы
        click.clickCenter();
        clickrole.clickCenter();
        clicksave.doubleClick();
        roli.open(); //открытие вкладки с Ролями
        addrole.clickCenter();
        addRoll.login(AddRollUser.DEFAULT);
        clickcheck.clickCenter();
        clicksave2.clickCenter();




    }


    @AfterMethod
    public void tearDown() {
        Verify.getFails();
    }
}
