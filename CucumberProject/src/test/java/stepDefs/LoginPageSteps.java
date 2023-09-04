package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static stepDefs.Hooks.*;

public class LoginPageSteps {
        @Given("A user registered successfully for this  valid Data {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
        public void AUserRegisteredSuccessfullyForThis_ValidScenario(String gender,String firstname ,String lastname,String email,String day,String month,String year,String companyname,String password,String confirmedpassword){
            driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");

            registerPage.chooseGender(gender);
            registerPage.personalData(firstname,lastname,email);
            registerPage.dateOfBirth(day,month,year);
            registerPage.companyName(companyname);
            registerPage.passwords(password,confirmedpassword);
            registerPage.ClickContinue();

        }
        @When("A user registered successfully for this valid {string} and valid {string}")
        public void AUserRegisteredSuccessfullyForThisValidScenario(String email, String password){
            driver.get("https://demo.nopcommerce.com/");
            loginPage.Login(email,password);

    }
        @Then("The URL is true and My account tab is displayed")
        public void TheURLIsTrueAndMyAccountTabIsDisplayed(){
            Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/","Success login");
            Assert.assertTrue(openPage.getMyAccBtn(),"My account tab is displayed");

            softAssert.assertAll();
    }

    @Given("A user registered successfully for this invalid scenario {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void AUserRegisteredSuccessfullyForThisInValidScenario(String gender,String firstname ,String lastname,String email,String day,String month,String year,String companyname,String password,String confirmedpassword){
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");

        registerPage.chooseGender(gender);
        registerPage.personalData(firstname,lastname,email);
        registerPage.dateOfBirth(day,month,year);
        registerPage.companyName(companyname);
        registerPage.passwords(password,confirmedpassword);
        registerPage.ClickContinue();

    }
        @When("A user inserts valid {string} and invalid {string} after registration")
        public void AUserInsertsValidUserNameAndInValidPasswordAfterRegistration(String username, String password){
            driver.get("https://demo.nopcommerce.com/");
            loginPage.Login(username,password);

    }
        @Then("An error Message is displayed and his color is red {string}")
    public void AnErrorMessageIsDisplayedAndHisColorIsRed(String color){
            softAssert.assertEquals(openPage.getErrorMsgColor(),color,"message color isn't red");

            softAssert.assertTrue(openPage.getErrorMsg().contains("Login was unsuccessful"));
            softAssert.assertAll();
    }

}
