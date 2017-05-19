package org.mytests.Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by student on 26.01.2017.
 */
public class UserC {
    public static final UserC DEFAULT = new UserC();


    public String username = "Test270";
    public String password = "randompass";
    public String RepeatPass = "randompass";
    public String LastName = "Сидоров";
    public String FirstName = "Кирилл";
    public String Ot = "Алексеевич";
    public String email = "mymail@yandex.ru";
    Date yourDate = new Date();
    SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy");
    public String data = DATE_FORMAT.format(yourDate);

    public String loginbutton = "loginbutton";

    public UserC() {
    }

    public UserC(String name) {
        this.username = username;
        this.password = password;
        this.RepeatPass = RepeatPass;
        this.LastName = LastName;
        this.FirstName = FirstName;
        this.Ot = Ot;
        this.email = email;
        this.data=data;
        this.loginbutton = loginbutton;
    }


}

