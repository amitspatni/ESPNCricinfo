package utils;

import io.cucumber.plugin.event.Node;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ActionHelper extends BaseClass{

    public static int TIMEOUT = 30;

    public static void waitForElementToLoad(String xpath) {

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        }

        catch (NoSuchElementException e) {
            System.out.println(e);
        }
    }

    public static void clickBtn(String xpath) {

        try {
            driver.findElement(By.xpath(xpath)).click();

        }
        catch (Exception e) {
            System.out.println();
        }
    }

    public static String getTitle() {

        return driver.getTitle();

    }

    public static void click_on_link(String xpath) {

        driver.findElement(By.xpath(xpath)).click();
        System.out.println("clicked on link");

    }

    public static void clickOnElementUsingJS(String xpath) {

        WebElement element = driver.findElement(By.xpath(xpath));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);

    }

    public static boolean isElementPresent(String xpath) {
        WebElement webElement = driver.findElement(By.xpath(xpath));
        try {
            boolean isPresent = webElement.isDisplayed();
            return isPresent;
        } catch (NoSuchElementException e) {
            return false;
        }

    }



}
