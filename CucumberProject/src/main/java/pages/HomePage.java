package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class HomePage  extends PageBase{
    //Locators
    private By addToWishlist = RelativeLocator.with(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]")).below(By.cssSelector("img[alt=\"Picture of HTC One M8 Android L 5.0 Lollipop\"]"));
    private By greenMsg = By.cssSelector("div[class=\"bar-notification success\"]");

    private By wishlistCart = By.cssSelector("span[class=\"wishlist-label\"]");
    private By qtyBox = By.cssSelector("input[class=\"qty-input\"]");

    private By faceBookLink = By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]");
    private By twitterLink = By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]");
    private By newsLink = By.cssSelector("a[href=\"/news/rss/1\"]");
    private By youTubeLink =By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]");
    //Variables

    public static String y;
    public static String x;
    public static String z;
    public static String n;

    public static String selectedSubCategoryText;
    public static String menu;
    public static String selectedCategoryText;

    public static String p;
    public static String v;
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

    public HomePage OpenFaceBook() {

        driver.findElement(faceBookLink).click();
        expwait().until(ExpectedConditions.numberOfWindowsToBe(2));
        System.out.println(arrylist().size());

        driver.switchTo().window(arrylist().get(1));
        System.out.println("tab 1:  " + driver.getCurrentUrl());
        y =driver.getCurrentUrl();

        driver.switchTo().window(arrylist().get(0));
        System.out.println("tab 0:  " + driver.getCurrentUrl());

        driver.close();

        return new HomePage(driver) ;
    }
    public HomePage OpenTwitter() {

        driver.findElement(twitterLink).click();

        expwait().until(ExpectedConditions.numberOfWindowsToBe(2));

        System.out.println(arrylist().size());

        driver.switchTo().window(arrylist().get(1));
        System.out.println("tab 1:  " + driver.getCurrentUrl());
        x =driver.getCurrentUrl();

        driver.switchTo().window(arrylist().get(0));
        System.out.println("tab 0:  " + driver.getCurrentUrl());

        driver.close();


        return new HomePage(driver) ;
    }
    public HomePage OpenNews() {
        driver.findElement(newsLink).click();

        expwait().until(ExpectedConditions.numberOfWindowsToBe(2));

        System.out.println(arrylist().size());

        driver.switchTo().window(arrylist().get(1));
        System.out.println("tab 1:  " + driver.getCurrentUrl());
        z =driver.getCurrentUrl();

        driver.switchTo().window(arrylist().get(0));
        System.out.println("tab 0:  " + driver.getCurrentUrl());

        driver.close();



        return new HomePage(driver);
    }
    public HomePage OpenYouTube() {

        driver.findElement(youTubeLink).click();

        expwait().until(ExpectedConditions.numberOfWindowsToBe(2));

        System.out.println(arrylist().size());

        driver.switchTo().window(arrylist().get(1));
        System.out.println("tab 1:  " + driver.getCurrentUrl());
        n =driver.getCurrentUrl();

        driver.switchTo().window(arrylist().get(0));
        System.out.println("tab 0:  " + driver.getCurrentUrl());

        driver.close();



        return new HomePage(driver) ;
    }


    public HomePage selectRandom1() {
        List<WebElement> mainLinks = driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/li"));
        int count = mainLinks.size();
        System.out.println("count is " + count);
        int selectedCategory = (int) Math.floor(Math.random() * count);
        actions().moveToElement(mainLinks.get(selectedCategory)).perform();
        selectedCategoryText = mainLinks.get(selectedCategory).getText();
        System.out.println("to know which category is selected:   " + selectedCategoryText);

        selectedCategory = selectedCategory + 1;
        String locator = "(//ul[@class='top-menu notmobile'])/li[" + selectedCategory + "]//li";
        List<WebElement> subCategoryLinks = driver.findElements(By.xpath(locator));

        if (!subCategoryLinks.isEmpty()) {
            int subCategoryCount = subCategoryLinks.size();
            System.out.println("profile links " + subCategoryCount);
            int selectedSubCategory = (int) Math.floor(Math.random() * subCategoryCount);
            selectedSubCategoryText = subCategoryLinks.get(selectedSubCategory).getText();
            subCategoryLinks.get(selectedSubCategory).click();
        } else {
            mainLinks.get(selectedCategory - 1).click();
            selectedSubCategoryText = selectedCategoryText;
        }
        menu = driver.findElement(By.cssSelector("div[class=\"page-title\"]")).getText();

        return new HomePage(driver) ;
    }

    public HomePage FirstSlider(){
        driver.get("https://demo.nopcommerce.com/nokia-lumia-1020");
        p = driver.getCurrentUrl();

        return new HomePage(driver);
    }
    public HomePage SecondSlider(){

        driver.get("https://demo.nopcommerce.com/iphone-6");
        v = driver.getCurrentUrl();

        return new HomePage(driver);
    }


}

