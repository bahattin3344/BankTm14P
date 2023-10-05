package StepDefinitions;

import Pages.Elements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class _4_BankAccount {
    Elements e=new Elements();
    @Then("Click Open New Account")
    public void clickOpenNewAccount() {
       e.myClick(e.newAccount);

    }

    @And("Select Checking")
    public void selectChecking() {
        Select select=new Select(e.accountType);
        select.selectByIndex(1);
    }

    @Then("Click Succes Button")
    public void clickSuccesButton() {
        e.myClick(e.accountButton);
    }

    @Then("Success message should be displayed Account")
    public void successMessageShouldBeDisplayedAccount() {
        Assert.assertTrue(e.accountSucces.getText().contains("Account Opened!"));
    }
}
