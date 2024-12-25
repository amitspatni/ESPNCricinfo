package pages;

import Framework.FrameWorkException;
import org.xml.sax.SAXException;
import utils.BaseClass;
import utils.ReadXmlFile;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.lang.reflect.Method;

public class HomePage extends ReadXmlFile {


    public static String get_link_Live_Scores() throws Exception {
        return getWebElementXpath("HomePage", "link_Live_Scores");
    }

    public static String btn_popUp_not_now() throws Exception {
        return getWebElementXpath("HomePage", "btn_popUp_not_now");
    }

    public static String btn_Yes_I_am_in() throws Exception {
        return getWebElementXpath("HomePage", "btn_Yes_I_am_in");
    }


}
