package Test.US_05;

import Pages.PearlymarketPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ReusableMethods;


import org.testng.Assert;
import org.testng.annotations.Test;


public class TC01 {

    @Test
    public void accountDetailGrn() {
        PearlymarketPage pearlymarketPage = new PearlymarketPage();

        Driver.getDriver().get(ConfigReader.getProperty("pearly_url"));

        //Driver.getDriver().get(ConfigReader.getProperty("pearly_url"));
        pearlymarketPage.signIn.click();
        pearlymarketPage.email.sendKeys(ConfigReader.getProperty("musteri_email"));
        pearlymarketPage.password.sendKeys(ConfigReader.getProperty("musteri_password"));
        pearlymarketPage.login.click();
        ReusableMethods.tumSayfaResmi();

        pearlymarketPage.accountDetails.click();
        ReusableMethods.tumSayfaResmi();
        //Assert.assertTrue(pearlymarketPage.accountDetails.isDisplayed());

    }

}
