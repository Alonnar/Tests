package entities;

/**
 * Created by student on 10.02.2017.
 */
public class UID {
    public static final UID DEFAULT = new UID();


    public String uid = "1";
    public String loginbutton = "loginbutton";

    public UID() {
    }

    public UID(String name) {
        this.uid = name;
        this.loginbutton = loginbutton;
    }


}
