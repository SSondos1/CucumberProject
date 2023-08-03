package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase {
    //Locators
    private By LoginButton1 = By.cssSelector("a[class=\"ico-login\"]");
    private By EmailField =By.id("Email");
    private By PasswordField = By.id("Password");
    private By LoginButton2 = By.cssSelector("button[class=\"button-1 login-button\"]");



    // Variables
// Constractors
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    // Actions
    public LoginPage Login(String Email, String Password){
        driver.findElement(LoginButton1).click();
        driver.findElement(EmailField).sendKeys(Email);
        driver.findElement(PasswordField).sendKeys(Password);
        driver.findElement(LoginButton2).click();
        return new LoginPage(driver);
    }

}
