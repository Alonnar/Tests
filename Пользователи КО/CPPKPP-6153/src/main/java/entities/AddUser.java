package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by student on 20.02.2017.
 */
public class AddUser {
    public static final AddUser DEFAULT = new AddUser();


    public String LastName = "Лужков";
    public String FirstName = "Иван";
    public String SecondName = "Витальевич";
    public String SecretWord = "ММТР";
    public String Email = "LushkovMMTR@mmtr.com";
    public String phone = "89031425512";
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
