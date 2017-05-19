package org.mytests.uiobjects.pages;

import com.epam.jdi.uitests.core.interfaces.base.IClickable;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.sun.jna.platform.win32.Netapi32Util;
import org.openqa.selenium.support.FindBy;

import java.awt.*;

/**
 * Created by student on 24.01.2017.
 */
public class LoginPage extends WebPage {

 public class UserC {
public String login="admin";
       public String password="password";
       public UserC(String name,
                    String password) {
           this.login = name;
            this.password = password;
       }
  }


    public class LoginForm extends Form<UserC> {
        @FindBy(id="Login")
        public TextField login;
        @FindBy(id="Password")
        public TextField password;
        @FindBy(css = ".btn-login")
        public Button loginButton;





    }
}