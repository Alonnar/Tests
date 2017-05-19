package org.mytests.Entities;

/**
 * Created by student on 07.02.2017.
 */
public class SearchUser {
    public static final SearchUser DEFAULT = new SearchUser();


    public String name = "Зотов";
    public String loginbutton = "loginbutton";
    public String zbrosbutton = "zbrosbutton";

    public SearchUser() {
    }

    public SearchUser(String name) {
        this.name = name;
        this.zbrosbutton = zbrosbutton;
        this.loginbutton = loginbutton;
    }


}
