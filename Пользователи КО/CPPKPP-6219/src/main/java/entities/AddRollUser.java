package entities;

/**
 * Created by student on 28.02.2017.
 */
public class AddRollUser {
    public static final AddRollUser DEFAULT = new AddRollUser();


    public String Name = "тест100500";
    public String lastdata = "28.12.2017";
    public String commentaries = "<>";

    public AddRollUser() {
    }

    public AddRollUser(String name) {
        this.Name = Name;
        this.lastdata = lastdata;
        this.commentaries = commentaries;

    }


}