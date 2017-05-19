package org.mytests.Entities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by student on 26.01.2017.
 */
public class UserC {
    public static final UserC DEFAULT = new UserC();


    public String username = "Test103";
    public String password = "randompass";
    public String RepeatPass = "randompass";
    public String LastName = "Зотов";
    public String FirstName = "Кирилл";
    public String Ot = "Алексеевич";
    public String email = "mymail@yandex.ru";
    Date yourDate = new Date();
    SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy");
    public String date = DATE_FORMAT.format(yourDate);
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
        this.date=date;
        this.loginbutton = loginbutton;
    }


}

