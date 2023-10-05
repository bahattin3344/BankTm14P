package StepDefinitions;


import Pages.Elements;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import javax.xml.bind.Element;

public class _06_MoneyTransfer_2 {

    Elements eb=new Elements();
    @Then("Save transactions ID and check")
    public void saveTransactionsIDAndCheck() {
        String transactionID = eb.getWebElement("transactionID").getText();

        eb.myClick(eb.getWebElement("findTransactions"));
        eb.mySendKeys(eb.getWebElement("inputTransaction"), transactionID);
        eb.myClick(eb.getWebElement("findTransactionsButton"));
        eb.myClick(eb.getWebElement("hesapIslemleri"));

        Assert.assertTrue(eb.getWebElement("transactionID").getText().equals(transactionID));
    }
}
