package StepDefinitions;

import Pages.Elements;
import Pages.Parent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _1_Login {
    Elements e=new Elements();
    @Given("Navigate to Parabank")
    public void navigateToParabank() {
        GWD.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");

    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        e.mySendKeys(e.inputUsername, "techno");
        e.mySendKeys(e.inputPassword, "123456789");
        e.myClick(e.logInButton);
    }


    @Then("User should logout")
    public void userShouldLogout() {
        e.myClick(e.logOutButton);
    }
}
