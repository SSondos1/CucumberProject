package pages;

import org.openqa.selenium.WebDriver;

public class SlidersPage extends PageBase{
    //Locators

    //Variables
    public static String p;
    public static String v;
    //Constractors
    public SlidersPage(WebDriver driver) {
        super(driver);
    }
    //Actions
    public SlidersPage FirstSlider(){
    driver.get("https://demo.nopcommerce.com/nokia-lumia-1020");
    p = driver.getCurrentUrl();

        return new SlidersPage(driver);
    }
    public SlidersPage SecondSlider(){

    driver.get("https://demo.nopcommerce.com/iphone-6");
        v = driver.getCurrentUrl();

        return new SlidersPage(driver);
    }
}
