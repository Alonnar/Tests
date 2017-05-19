package org.mytests.tests;

import com.sun.jna.platform.win32.Netapi32Util;
import org.mytests.uiobjects.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import static org.mytests.uiobjects.EpamSite.*;

/**
 * Created by Alexander_Petrovskiy on 5/23/2016.
 */
public class SmokeTest extends InitTests {

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
