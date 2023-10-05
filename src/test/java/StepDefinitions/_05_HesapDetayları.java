package StepDefinitions;


import Pages.Elements;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class _05_HesapDetayları {
    Elements eb=new Elements();
    @Then("Verify from account info")
    public void verifyFromAccountInfo() {
        int accountNumber = Integer.parseInt(eb.getWebElement("firstAccount").getText()); //13788
        double balance = Double.parseDouble
                (eb.getWebElement("balanceCheck").getText().replaceAll("[^0-9.]", ""));
        double availableAmount = Double.parseDouble
                (eb.getWebElement("availableAmount").getText().replaceAll("[^0-9.]", ""));

        Assert.assertTrue(Integer.parseInt(eb.getWebElement("firstAccount").getText()) == accountNumber);
        Assert.assertTrue(Double.parseDouble
                (eb.getWebElement("balanceCheck").getText().replaceAll("[^0-9.]", ""))==balance);
        Assert.assertTrue(Double.parseDouble
                (eb.getWebElement("availableAmount").getText().replaceAll("[^0-9.]", ""))==availableAmount);

    }

    @Then("Verify from account details")
    public void verifyFromAccountDetails() {
        Assert.assertTrue(eb.getWebElement("fundsTransfer").getText().toLowerCase().contains("funds transfer"));
        Assert.assertTrue(eb.getWebElement("debit").getText().contains("100"));
    }

    @Then("Check transactions ID")
    public void checkTransactionsID() {
        String transactionID = eb.getWebElement("transactionID").getText();
        Assert.assertTrue(eb.getWebElement("transactionID").getText().equals(transactionID));
    }
}
