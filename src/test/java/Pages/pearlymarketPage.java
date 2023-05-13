package Pages;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pearlymarketPage {
    public pearlymarketPage() {
        PageFactory.initElements(Driver.getDriver(), this);}










      //Burcu Palabiyik --->   20-70

    @FindBy(xpath = "//*[@class='nav-link active']" )
    public WebElement signIn;
    @FindBy(xpath = "//input[@name='username']" )
    public WebElement username;
    @FindBy(xpath = "//*[@id='password']" )
    public WebElement password;
    @FindBy(xpath = "//*[@name='login']" )
    public WebElement login;
    























}
