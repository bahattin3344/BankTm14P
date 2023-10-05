package Bilgehan.StepDefinitions;

import Bilgehan.Pages.Elements;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class _06_MoneyTransfer_2 {

    Elements elements = new Elements();
    @Then("Save transactions ID and check")
    public void saveTransactionsIDAndCheck() {
        String transactionID = elements.getWebElement("transactionID").getText();

        elements.myClick(elements.getWebElement("findTransactions"));
        elements.mySendKeys(elements.getWebElement("inputTransaction"), transactionID);
        elements.myClick(elements.getWebElement("findTransactionsButton"));
        elements.myClick(elements.getWebElement("hesapIslemleri"));

        Assert.assertTrue(elements.getWebElement("transactionID").getText().equals(transactionID));
    }
}
