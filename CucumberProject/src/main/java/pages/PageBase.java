package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageBase {
    WebDriver driver;

    public PageBase(WebDriver driver) {
        this.driver = driver;
    }

    public Actions actions() {
        return new Actions(driver);
    }


    public WebDriverWait expwait() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        return wait;
    }



    //expwait to click
    public PageBase click1(By locator) {
        WebElement webElement = driver.findElement(locator);
        expwait().until(ExpectedConditions.elementToBeClickable(webElement));
        webElement.click();
        return new PageBase(driver);
    }

    public PageBase insertText(By locator){
        WebElement webElement = driver.findElement(locator);

        expwait().until(ExpectedConditions.invisibilityOf(webElement));
        return new PageBase(driver);

    }

    public PageBase click2(By locator) {


        WebElement foo = driver.findElement(locator);

        try {
            foo.click();
        }catch (StaleElementReferenceException e) {
            System.out.println(e);
        }

        return new PageBase(driver);
    }
}
