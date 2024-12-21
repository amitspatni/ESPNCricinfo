package stepsDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class Hooks {

    public WebDriver driver;
    @Before
    public void setup() {
      driver =  BaseClass.setUp("chrome");

    }

    @After
    public void tearDown() {
        BaseClass.tearDown();
    }


}
