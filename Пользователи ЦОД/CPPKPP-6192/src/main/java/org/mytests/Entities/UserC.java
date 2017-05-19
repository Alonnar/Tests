package org.mytests.Entities;

/**
 * Created by student on 26.01.2017.
 */
public class UserC {
    public static final UserC DEFAULT = new UserC();



    public String LastName = "Котова";

    public String loginbutton = "loginbutton";

    public UserC() {
    }

    public UserC(String name) {
        this.LastName = LastName;
        this.loginbutton = loginbutton;
    }


}

