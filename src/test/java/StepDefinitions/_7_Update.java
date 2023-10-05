package StepDefinitions;

import Pages.Elements;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _7_Update {
    Elements e=new Elements();
    @Then("User Should Click Contact Info")
    public void userShouldClickContactInfo() {
        e.myClick(e.info);
    }

    @When("Enter new first name and click update profile")
    public void enterNewFirstNameAndClickUpdateProfile() {
        e.newName.clear();
        e.mySendKeys(e.newName,"deniz");
        e.myClick(e.update);
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        e.verifyContainsText(e.onay,"Profile Updated");
    }
}
