package utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class BaseClass {

    public static WebDriver driver;

    private static WebDriverWait waitDriver;
    //initialize timeouts
    private final static int TIMEOUT = 30;
    private final static int PAGE_LOAD_TIMEOUT = 50;


    public static WebDriver setUp(String browser)  {
        if (driver==null) {

            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
                case "safari":
                    driver = new SafariDriver();
                    break;
                default:
                    System.out.println("driver not supported");

            }
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PAGE_LOAD_TIMEOUT));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
            driver.manage().window().maximize();
            driver.get("https://www.espncricinfo.com/");
        }

        return driver;
    }


    public static void tearDown() {
        if (driver != null) {
           // driver.close();
            driver.quit();
        }
        driver = null;

    }


}
