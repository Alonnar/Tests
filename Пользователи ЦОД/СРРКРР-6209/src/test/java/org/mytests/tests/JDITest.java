package org.mytests.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.lang.reflect.Method;

import static org.mytests.uiobjects.ADMSite.*;

/**
 * Created by Alexander_Petrovskiy on 5/23/2016.
 */
public class JDITest extends InitTests {

    @BeforeMethod
    public void before(Method method) throws IOException {
        homePage.isOpened();
    }







}
