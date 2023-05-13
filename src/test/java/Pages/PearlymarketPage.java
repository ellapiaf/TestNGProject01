package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PearlymarketPage {

    public PearlymarketPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
















































































































































































































        @FindBy(xpath = "//input[@id='username']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement login;

@FindBy(xpath = "//h2[text()='My Account']")
    public WebElement myAccount;

@FindBy(xpath = "Account details")
    public WebElement accountDetails;

@FindBy(xpath = "//span[text()='Sign In']")
    public WebElement signIn;



}
