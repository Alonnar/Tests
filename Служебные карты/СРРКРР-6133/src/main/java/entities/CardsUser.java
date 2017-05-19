package entities;

import factaries.ClickB1;

/**
 * Created by student on 15.02.2017.
 */
public class CardsUser {
    public static final CardsUser DEFAULT = new CardsUser();

    public String serialNumber = "3";
    public String user = "К";
    public String loginbutton = "loginbutton";
  //  public String firstData = "16.02.2017";


    public CardsUser() {
    }

    public CardsUser(String user, String serialNumber, String firstData) {
        this.serialNumber = serialNumber;
        this.user = user;
        this.loginbutton = loginbutton;
    //    this.firstData = firstData;
    }


}
