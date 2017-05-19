package org.mytests.Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by student on 03.05.2017.
 */
public class AddRollUser {
    public static final AddRollUser DEFAULT = new AddRollUser();


    public String Name = "тест100501";
    Date yourDate = new Date();
    SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy");
    public String firstdata = DATE_FORMAT.format(yourDate);

    Date yourDate2 = new Date();
    public String lastdata = DATE_FORMAT.format(yourDate);

    public String commentaries = "<>";

    public AddRollUser() {
    }

    public AddRollUser(String name) {
        this.Name = Name;
        this.firstdata = firstdata;
        this.lastdata = lastdata;
        this.commentaries = commentaries;

    }


}