package entities;

/**
 * Created by student on 10.03.2017.
 */
public class ChangeRollUser {
public static final ChangeRollUser DEFAULT = new ChangeRollUser();


    public String Name = "тестик3";
    public String lastdata = "27.12.2017";
    public String commentaries = "вууау";

    public ChangeRollUser() {
    }

    public ChangeRollUser(String name) {
        this.Name = Name;
        this.lastdata = lastdata;
        this.commentaries = commentaries;

    }


}
