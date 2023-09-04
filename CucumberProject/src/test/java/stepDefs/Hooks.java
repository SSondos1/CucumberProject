package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;
import pages.*;

import java.time.Duration;

public class Hooks {
    public static WebDriver driver;
    public static LoginPage loginPage;
    public static RegisterPage registerPage;
    public static HomePage homePage;
    public static SoftAssert softAssert;
    public static OpenPage openPage;
    public static PageBase pageBase;
    public static SearchPage searchPage;

    @Before
    public void setUp(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        pageBase = new PageBase(driver);
        registerPage = new RegisterPage(driver);
        loginPage = new LoginPage(driver);
        openPage = new OpenPage(driver);
        homePage = new HomePage(driver);
        searchPage = new SearchPage(driver);
        softAssert = new SoftAssert();






    }

 @After
  public void tearDown(){

    driver.quit();
   }
}
