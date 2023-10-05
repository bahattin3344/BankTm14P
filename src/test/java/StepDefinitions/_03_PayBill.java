package StepDefinitions;


import Pages.Elements;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class _03_PayBill {

    Elements eb=new Elements();

    @Then("Verify from text")
    public void verifyFromText(DataTable dt) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        List<String> items = dt.asList(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement e = eb.getWebElement(items.get(i));
            Assert.assertTrue(e.getText().toLowerCase().contains("complete"));
        }
    }
}
