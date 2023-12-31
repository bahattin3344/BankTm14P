package StepDefinitions;


import Pages.Elements;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class _06_MoneyTransfer {

    Elements eb=new Elements();

    @Given("Navigate to parabank")
    public void navigateToParabank() {
        GWD.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @When("Send keys on the element")
    public void sendKeysOnTheElement(DataTable dt) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        List<List<String>> items = dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement e = eb.getWebElement(items.get(i).get(0));
            String yazi = items.get(i).get(1);
            eb.mySendKeys(e, yazi);
        }
    }

    @Then("Click on the element")
    public void clickOnTheElement(DataTable dt) {
        List<String> items = dt.asList(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement e = eb.getWebElement(items.get(i));
            eb.myClick(e);
        }
    }

    @And("Verify from web element")
    public void verifyFromWebElement(DataTable dt) {
        List<String> items = dt.asList(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement e = eb.getWebElement(items.get(i));
            Assert.assertTrue(e.isEnabled());
        }
    }

    @Then("Select by the web element")
    public void selectByTheWebElement(DataTable dt) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        List<List<String>> items = dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement e = eb.getWebElement(items.get(i).get(0));
            int index = Integer.parseInt(items.get(i).get(1));

            Select select = new Select(e);
            select.selectByIndex(index);
        }
    }
}
