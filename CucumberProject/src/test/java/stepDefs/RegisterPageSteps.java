package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static stepDefs.Hooks.*;

public class RegisterPageSteps {
        @Given("A user Navigates to registration URL")
        public void AUserNavigatesToRegistrationURL(){
            driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");

    }
        @When("A user inserts valid Data {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
        public void AUserInsertsValidData(String gender,String firstname ,String lastname,String email,String day,String month,String year,String companyname,String password,String confirmedpassword){
            registerPage.chooseGender(gender);
            registerPage.personalData(firstname,lastname,email);
            registerPage.dateOfBirth(day,month,year);
            registerPage.companyName(companyname);
            registerPage.passwords(password,confirmedpassword);
            registerPage.ClickContinue();

    }
        @Then("A registration Msg is appeared and his color is green {string}")
        public void ARegistrationMsgIsAppeared(String color){
            Assert.assertEquals(openPage.getRegritionPassMsg(),"Your registration completed");
            softAssert.assertEquals(openPage.getMsgColor(),color,"message color isn't green");

            softAssert.assertAll();
    }

}
