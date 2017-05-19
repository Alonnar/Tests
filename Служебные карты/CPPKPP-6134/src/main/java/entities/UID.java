package entities;

/**
 * Created by student on 10.02.2017.
 */
public class UID {
    public static final UID DEFAULT = new UID();


    public String endData = "14.01.2018";
    public String loginbutton = "loginbutton";

    public UID() {
    }

    public UID(String name) {
        this.endData = name;
        this.loginbutton = loginbutton;
    }


}
