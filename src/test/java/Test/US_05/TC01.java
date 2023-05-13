package Test.US_05;

import Pages.PearlymarketPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ReusableMethods;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01 {
    PearlymarketPage pearlymarketPage = new PearlymarketPage();

    @Test
    public void accountDetailGrn() {
        Driver.getDriver().get(ConfigReader.getProperty("pearly_url"));

        pearlymarketPage.email.sendKeys(ConfigReader.getProperty("musteri_email"));
        pearlymarketPage.password.sendKeys(ConfigReader.getProperty("musteri_password"));
        pearlymarketPage.login.click();
        Assert.assertTrue(pearlymarketPage.myAccount.isDisplayed());

        Assert.assertTrue(pearlymarketPage.accountDetails.isDisplayed());
        pearlymarketPage.accountDetails.click();
        ReusableMethods.tumSayfaResmi();
       //Assert.assertTrue(pearlymarketPage.accountDetails.isDisplayed());

    }

}
