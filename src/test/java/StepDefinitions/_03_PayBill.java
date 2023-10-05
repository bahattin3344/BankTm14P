package StepDefinitions;

import Bilgehan.Pages.Elements;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class _03_PayBill {

    Elements elements = new Elements();

    @Then("Verify from text")
    public void verifyFromText(DataTable dt) {
        List<String> items = dt.asList(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement e = elements.getWebElement(items.get(i));
            Assert.assertTrue(e.getText().toLowerCase().contains("complete"));
        }
    }
}
