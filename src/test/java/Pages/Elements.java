package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Elements extends Parent{
    public Elements() {

        PageFactory.initElements(GWD.getDriver(), this);
        // Sevgili PageFactory sen bu sayfanın
        // sahibisin, senden ricam aşağıdaki locatorları
        // ben kullanacağım zaman driver üzerinden
        // bulup başlatıp, bana hazır et.
        // ben artık find element le uğraşmak
        // istemiyorum.
    }
    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputUsername;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement inputPassword;

    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement logInButton;
    @FindBy(linkText = "Log Out")
    public WebElement logOutButton;

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

    @FindBy(xpath = "//div[@ng-show='showResult']//h1")
    private WebElement successfullBill;

    @FindBy(xpath = "//h1[@class='title']")
    private WebElement successTransfer;

    @FindBy(linkText = "Accounts Overview")
    private WebElement accountsOverview;

    @FindBy(xpath = "(//tr[@class='ng-scope']//td//a)[1]")
    private WebElement firstAccount;

    @FindBy(xpath = "(//table[@id='transactionTable']//td//a)[1]")
    private WebElement hesapIslemleri;

    @FindBy(xpath = "//table/tbody/tr[1]/td[2]")
    private WebElement transactionID;

    @FindBy(linkText = "Find Transactions")
    private WebElement findTransactions;

    @FindBy(xpath = "//input[@id='criteria.transactionId']")
    private WebElement inputTransaction;

    @FindBy(xpath = "//button[@ng-click=\"criteria.searchType = 'ID'\"]")
    private WebElement findTransactionsButton;

    @FindBy(xpath = "(//tr[@class='ng-scope']//td)[2]")
    private WebElement balanceCheck;

    @FindBy(xpath = "(//tr[@class='ng-scope']//td)[3]")
    private WebElement availableAmount;

    @FindBy(xpath = "//tr[@class='ng-scope']//td[@class='ng-binding']")
    private WebElement date;

    @FindBy(xpath = "//td//a[@class='ng-binding']")
    private WebElement fundsTransfer;

    @FindBy(xpath = "//td[@ng-if=\"transaction.type == 'Debit'\"]")
    private WebElement debit;

    @FindBy(xpath = "//*[@id=\"leftPanel\"]/ul/li[6]/a")
    public WebElement info;
    @FindBy(css = "[id='customer.firstName']")
    public WebElement newName;
    @FindBy(css="[value='Update Profile']")
    public WebElement update;
    @FindBy(css = "#rightPanel > div > div > h1")
    public WebElement onay;
    @FindBy(css = "#leftPanel > ul > li:nth-child(7) > a")
    public WebElement loan;
    @FindBy(css = "[id='amount']")
    public WebElement loanAmount;
    @FindBy(css = "[id='downPayment']")
    public WebElement downPayment;
    @FindBy(css = "[id='fromAccountId']")
    public WebElement selectAccount;
    @FindBy(css = "[value='Apply Now']")
    public WebElement krediOnay;
    @FindBy(css = "#leftPanel > ul > li:nth-child(1) > a")
    public WebElement newAccount;
    @FindBy(css = "#type")
    public WebElement accountType;
    @FindBy(css = "#rightPanel > div > div > form > div > input")
    public WebElement accountButton;
    @FindBy(css = "#rightPanel > div > div > h1")
    public WebElement accountSucces;
    //
    @FindBy(linkText = "Register")
    private WebElement register;

    @FindBy(id = "customer.firstName")
    private WebElement inputFirstName;

    @FindBy(id = "customer.lastName")
    private WebElement inputLastName;

    @FindBy(id = "customer.address.street")
    private WebElement inputAddress;

    @FindBy(id = "customer.address.city")
    private WebElement inputCity;

    @FindBy(id = "customer.address.state")
    private WebElement inputState;

    @FindBy(id = "customer.address.zipCode")
    private WebElement inputZipCode;

    @FindBy(id = "customer.phoneNumber")
    private WebElement inputPhoneNumber;

    @FindBy(id = "customer.ssn")
    private WebElement inputSSN;

    @FindBy(id = "customer.username")
    private WebElement inputUsername2;

    @FindBy(id = "customer.password")
    private WebElement inputPassword2;

    @FindBy(id = "repeatedPassword")
    private WebElement inputConfirm;

    @FindBy(xpath = "//input[@value='Register']")
    private WebElement registerButton;

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
            case "info" : return this.info;
            case "newName" : return this.newName;
            case "update" : return this.update;
            case "onay" : return this.onay;
            case "loan" : return this.loan;
            case "loanAmount" : return this.loanAmount;
            case "downPayment": return this.downPayment;
            case "selectAccount" :return this.selectAccount;
            case  " krediOnay" :   return this.krediOnay;
            case "successTransfer" : return this.successTransfer;
            case "accountsOverview" : return this.accountsOverview;
            case "firstAccount" : return this.firstAccount;
            case "hesapIslemleri" : return this.hesapIslemleri;
            case "transactionID" : return this.transactionID;
            case "findTransactions" : return this.findTransactions;
            case "inputTransaction" : return this.inputTransaction;
            case "findTransactionsButton" : return this.findTransactionsButton;
            case "balanceCheck" : return this.balanceCheck;
            case "availableAmount" : return this.availableAmount;
            case "date" : return this.date;
            case "fundsTransfer" : return this.fundsTransfer;
            case "Register" : return this.register;
            case "customer.firstName" : return this.inputFirstName;
            case "customer.lastName" : return this.inputLastName;
            case "customer.address.street" : return this.inputAddress;
            case "customer.address.city" : return this.inputCity;
            case "customer.address.state" : return this.inputState;
            case "customer.address.zipCode" : return this.inputZipCode;
            case "customer.phoneNumber" : return this.inputPhoneNumber;
            case "customer.ssn" : return this.inputSSN;
            case "customer.username" : return this.inputUsername2;
            case "customer.password" : return this.inputPassword2;
            case "repeatedPassword" : return this.inputConfirm;
            case "//input[@value='Register']" : return this.registerButton;
        }
        return null;
    }
}
