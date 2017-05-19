package org.mytests.uiobjects.pages;

import com.epam.jdi.uitests.core.interfaces.base.IClickable;
import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.core.interfaces.common.ITextField;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import org.mytests.Entities.User;
import org.openqa.selenium.support.FindBy;

import java.awt.*;

/**
 * Created by student on 25.01.2017.
 */
public class Login extends Form<User> {
    @FindBy(id = "Login")
    private ITextField login;
    @FindBy(id = "Password")
    private ITextField password;
    @FindBy(css = ".btn.btn-default")
    private IButton button;
 //   private IButton loginButton;
@Override
public void submit(User user) {
    button.click();
    super.submit(user);
}
}
