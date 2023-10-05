package StepDefinitions;

import Pages.Elements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

public class _8_KrediBaşvuru {
    Elements e=new Elements();
    @Then("User Should Click Request Loan")
    public void userShouldClickRequestLoan() {
        e.myClick(e.loan);
    }

    @When("Enter loan and down")
    public void enterLoanAndDown() {
        e.mySendKeys(e.loanAmount,"$2000");
        e.mySendKeys(e.downPayment,"$400");
    }

    @And("Select from account")
    public void selectFromAccount() {
        Select select=new Select(e.selectAccount);
        select.selectByIndex(1);
    }

    @Then("Click Apply Now")
    public void clickApplyNow() {
        e.myClick(e.krediOnay);
    }
}
