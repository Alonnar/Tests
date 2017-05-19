package entities;

/**
 * Created by student on 28.02.2017.
 */
public class SearchUser  {
    public static final SearchUser DEFAULT = new SearchUser();



    public String name = "Лужков";
    public String loginbutton = "loginbutton";

    public SearchUser() {
    }

    public SearchUser(String name) {

        this.name = name;
        this.loginbutton = loginbutton;
    }


}
