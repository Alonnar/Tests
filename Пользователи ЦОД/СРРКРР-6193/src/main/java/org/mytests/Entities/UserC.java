package org.mytests.Entities;

/**
 * Created by student on 26.01.2017.
 */
public class UserC {
public static final UserC DEFAULT = new UserC();


public String name = "Иванова";
public String loginbutton = "loginbutton";
public String zbrosbutton = "zbrosbutton";

public UserC() {
        }

public UserC(String name) {
        this.name = name;
        this.zbrosbutton = zbrosbutton;
        this.loginbutton = loginbutton;
        }


        }
