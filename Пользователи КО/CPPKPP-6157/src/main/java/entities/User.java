package entities;

/**
 * Created by student on 10.02.2017.
 */
public class User {
    public static final User DEFAULT = new User();

    public String login = "admin";
    public String password = "password";
    public String loginbutton = "loginbutton";
    public String name = "Name";
    public String lastName = "Last Name";
    public String description = "Description";

    public User() {
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.loginbutton = loginbutton;
    }


}
