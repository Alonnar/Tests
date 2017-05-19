package entities;

/**
 * Created by student on 20.02.2017.
 */
public class AddUser {
    public static final AddUser DEFAULT = new AddUser();



    public String commentaries = "Всё идёт по плану, но не всегда";
    public String loginbutton = "loginbutton";

    public AddUser() {
    }

    public AddUser(String name) {

        this.commentaries = commentaries;
        this.loginbutton = loginbutton;
    }


}
