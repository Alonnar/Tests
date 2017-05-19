package uiobjects.pages;

import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import org.openqa.selenium.support.FindBy;

import java.awt.*;

/**
 * Created by student on 10.02.2017.
 */
public class LoginPage extends WebPage {

    public class User {
        public String login="admin";
        public String password="password";
        public User(String name,
                    String password) {
            this.login = name;
            this.password = password;
        }
    }


    public class LoginForm extends Form<User> {
        @FindBy(id="Login")
        public TextField login;
        @FindBy(id="Password")
        public TextField password;
        @FindBy(css = ".btn-login")
        public Button loginButton;





    }
}
