package Bilgehan.StepDefinitions;

import Bilgehan.Pages.Elements;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class _05_HesapDetayları {
    Elements elements = new Elements();
    @Then("Verify from account info")
    public void verifyFromAccountInfo() {
        int accountNumber = Integer.parseInt(elements.getWebElement("firstAccount").getText()); //13788
        double balance = Double.parseDouble
                (elements.getWebElement("balanceCheck").getText().replaceAll("[^0-9.]", ""));
        double availableAmount = Double.parseDouble
                (elements.getWebElement("availableAmount").getText().replaceAll("[^0-9.]", ""));

        Assert.assertTrue(Integer.parseInt(elements.getWebElement("firstAccount").getText()) == accountNumber);
        Assert.assertTrue(Double.parseDouble
                (elements.getWebElement("balanceCheck").getText().replaceAll("[^0-9.]", ""))==balance);
        Assert.assertTrue(Double.parseDouble
                (elements.getWebElement("availableAmount").getText().replaceAll("[^0-9.]", ""))==availableAmount);

    }

    @Then("Verify from account details")
    public void verifyFromAccountDetails() {
        Assert.assertTrue(elements.getWebElement("fundsTransfer").getText().toLowerCase().contains("funds transfer"));
        Assert.assertTrue(elements.getWebElement("debit").getText().contains("100"));
    }

    @Then("Check transactions ID")
    public void checkTransactionsID() {
        String transactionID = elements.getWebElement("transactionID").getText();
        Assert.assertTrue(elements.getWebElement("transactionID").getText().equals(transactionID));
    }
}
