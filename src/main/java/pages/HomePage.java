package pages;

import utils.Utilities;


public class HomePage extends Utilities {


    public static String get_link_Live_Scores() {
        return getWebElementXpath("HomePage", "link_Live_Scores");
    }

    public static String btn_popUp_not_now() {
        return getWebElementXpath("HomePage", "btn_popUp_not_now");
    }

    public static String btn_Yes_I_am_in()  {
        return getWebElementXpath("HomePage", "btn_Yes_I_am_in");
    }

}
