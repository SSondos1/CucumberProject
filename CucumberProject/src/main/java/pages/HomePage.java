package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.locators.RelativeLocator;

public class HomePage  extends PageBase{
    //Locators
    private By addToWishlist = RelativeLocator.with(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]")).below(By.cssSelector("img[alt=\"Picture of HTC One M8 Android L 5.0 Lollipop\"]"));
    private By greenMsg = By.cssSelector("div[class=\"bar-notification success\"]");

    private By wishlistCart = By.cssSelector("span[class=\"wishlist-label\"]");
    private By qtyBox = By.cssSelector("input[class=\"qty-input\"]");


    //Variables
    //Constractors
    public HomePage(WebDriver driver) {
        super(driver);
    }
    //Actions



    public HomePage AddToWishlist(){
        click1(addToWishlist);
        return new HomePage(driver);
    }
    public boolean successMsgDisplayed(){
        return driver.findElement(greenMsg).isDisplayed();
    }
    public String getMsgColoration(){
        String u = driver.findElement(greenMsg).getCssValue("background-color");
        return  Color.fromString(u).asHex();
    }
    public HomePage WishlistCart(){
        insertText(greenMsg);
        click1(wishlistCart);

        return new HomePage(driver);
    }

    public String checkQtyValue(){

        return driver.findElement(qtyBox).getAttribute("value");

    }


}

