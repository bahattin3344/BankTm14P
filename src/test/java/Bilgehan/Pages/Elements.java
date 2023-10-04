package Bilgehan.Pages;

import Pages.Parent;
import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements extends Parent {

    public Elements() {PageFactory.initElements(GWD.getDriver(), this);}

    @FindBy(xpath = "//input[@name='username']")
    private WebElement inputUsername;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement inputPassword;

    @FindBy(xpath = "//input[@value='Log In']")
    private WebElement logInButton;

    @FindBy(linkText = "Log Out")
    private WebElement logOutButton;

    @FindBy(linkText = "Transfer Funds")
    private WebElement moneyTransferButton;

    @FindBy(xpath = "//input[@id='amount']")
    private WebElement inputAmount;

    @FindBy(xpath = "//select[@id='fromAccountId']")
    private WebElement selectFromAccount;

    @FindBy(xpath = "//select[@id='toAccountId']")
    private WebElement selectToAccount;

    @FindBy(xpath = "//input[@value='Transfer']")
    private WebElement transferButton;

    @FindBy(linkText = "Bill Pay")
    private WebElement billPayButton;

    @FindBy(xpath = "//input[@name='payee.name']")
    private WebElement inputPayeeName;

    @FindBy(xpath = "//input[@name='payee.address.street']")
    private WebElement inputPayeeAddress;

    @FindBy(xpath = "//input[@name='payee.address.city']")
    private WebElement inputPayeeCity;

    @FindBy(xpath = "//input[@name='payee.address.state']")
    private WebElement inputPayeeState;

    @FindBy(xpath = "//input[@name='payee.address.zipCode']")
    private WebElement inputPayeeZipCode;

    @FindBy(xpath = "//input[@name='payee.phoneNumber']")
    private WebElement inputPayeeNumber;

    @FindBy(xpath = "//input[@name='payee.accountNumber']")
    private WebElement inputPayeeAccount;

    @FindBy(xpath = "//input[@name='verifyAccount']")
    private WebElement inputVerifyAccount;

    @FindBy(xpath = "//input[@name='amount']")
    private WebElement inputBillAmount;

    @FindBy(xpath = "//input[@value='Send Payment']")
    private WebElement sendPaymentButton;

    @FindBy(xpath = "//div[@ng-show='showForm']//h1")
    private WebElement successfullBill;

    public WebElement getWebElement(String element){
        switch (element){
            case "inputUsername" : return this.inputUsername;
            case "inputPassword" : return this.inputPassword;
            case "logInButton" : return this.logInButton;
            case "logOutButton" : return this.logOutButton;
            case "moneyTransferButton" : return this.moneyTransferButton;
            case "inputAmount" : return this.inputAmount;
            case "selectFromAccount" : return this.selectFromAccount;
            case "selectToAccount" : return this.selectToAccount;
            case "transferButton" : return this.transferButton;
            case "billPayButton" : return this.billPayButton;
            case "inputPayeeName" : return this.inputPayeeName;
            case "inputPayeeAddress" : return this.inputPayeeAddress;
            case "inputPayeeCity" : return this.inputPayeeCity;
            case "inputPayeeState" : return this.inputPayeeState;
            case "inputPayeeZipCode" : return this.inputPayeeZipCode;
            case "inputPayeeNumber" : return this.inputPayeeNumber;
            case "inputPayeeAccount" : return this.inputPayeeAccount;
            case "inputVerifyAccount" : return this.inputVerifyAccount;
            case "inputBillAmount" : return this.inputBillAmount;
            case "sendPaymentButton" : return this.sendPaymentButton;
            case "successfullBill" : return this.successfullBill;
        }
        return null;
    }

    // tester.14@mail.com
    // 12345678
}
