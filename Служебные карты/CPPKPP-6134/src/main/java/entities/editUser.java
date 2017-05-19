package entities;

/**
 * Created by student on 13.02.2017.
 */
public class editUser {
    public static final editUser DEFAULT = new editUser();


    public String endData = "14.01.2018";
    public String loginbutton = "loginbutton";

    public editUser() {
    }

    public editUser(String name) {
        this.endData = name;
        this.loginbutton = loginbutton;
    }


}
