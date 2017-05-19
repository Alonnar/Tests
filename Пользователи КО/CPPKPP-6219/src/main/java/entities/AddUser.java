package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by student on 20.02.2017.
 */
public class AddUser {
    public static final AddUser DEFAULT = new AddUser();


    public String LastName = "Мошкин";
    public String FirstName = "Генадий";
    public String SecondName = "Алексеевич";
    public String SecretWord = "ММТР";
    public String Email = "MoshkinMMTR@mmtr.com";
    public String phone = "89031425313";
    Date yourDate = new Date();
    SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy");
    public String firstdata = DATE_FORMAT.format(yourDate);
    public String lastdata = "29.12.2017";
    public String commentaries = "ТестовыйСценарий";
    public String loginbutton = "loginbutton";

    public AddUser() {
    }

    public AddUser(String name) {
        this.LastName = LastName;
        this.FirstName = FirstName;
        this.SecondName = SecondName;
        this.SecretWord = SecretWord;
        this.Email = Email;
        this.phone = phone;
        this.firstdata = firstdata;
   //     this.lastdata = lastdata;
        this.commentaries = commentaries;
        this.loginbutton = loginbutton;
    }


}
