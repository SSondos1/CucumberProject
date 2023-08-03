package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static stepDefs.Hooks.*;

public class LoginPageSteps {
        @Given("A user registered successfully for this  valid scenario")
        public void AUserRegisteredSuccessfullyForThis_ValidScenario(){
            driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");

            registerPage.chooseGender("female");
            registerPage.personalData("Sondos","Nasser","mahmoudN22@gmail.com");
            registerPage.dateOfBirth("1","1","2000");
            registerPage.companyName("Vois");
            registerPage.passwords("27863686","27863686");
            registerPage.ClickContinue();

        }
        @When("A user registered successfully for this valid scenario")
        public void AUserRegisteredSuccessfullyForThisValidScenario(){
            driver.get("https://demo.nopcommerce.com/");
            loginPage.Login("mahmoudN22@gmail.com","27863686");

    }
        @Then("The URL is true and My account tab is displayed")
        public void TheURLIsTrueAndMyAccountTabIsDisplayed(){
            Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/","Success login");
            Assert.assertTrue(openPage.getMyAccBtn(),"My account tab is displayed");

            softAssert.assertAll();
    }

    @Given("A user registered successfully for this in valid scenario")
    public void AUserRegisteredSuccessfullyForThisInValidScenario(){
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");

        registerPage.chooseGender("female");
        registerPage.personalData("Sondos","Nasser","mahmoudN11@gmail.com");
        registerPage.dateOfBirth("1","1","2000");
        registerPage.companyName("Vois");
        registerPage.passwords("27863686","27863686");
        registerPage.ClickContinue();

    }
        @When("A user inserts valid user name and in valid password after registration")
        public void AUserInsertsValidUserNameAndInValidPasswordAfterRegistration(){
            driver.get("https://demo.nopcommerce.com/");
            loginPage.Login("mahmoudN11@gmail.com","12345678");

    }
        @Then("An error Message is displayed and his color is red")
    public void AnErrorMessageIsDisplayedAndHisColorIsRed(){
            softAssert.assertEquals(openPage.getErrorMsgColor(),"#e4434b","message color isn't red");

            softAssert.assertTrue(openPage.getErrorMsg().contains("Login was unsuccessful"));
            softAssert.assertAll();
    }

}
