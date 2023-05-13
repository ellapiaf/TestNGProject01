package Pages;

import Utilities.ConfigReader;
import Utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class pearlymarketPage {
    public pearlymarketPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


}
