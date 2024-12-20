package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.TrendyolHomePage;
import utils.Driver;
import utils.ReusablaMethods;

import java.time.Duration;

public class AddToChartStepDefinations {

    private TrendyolHomePage trendyolHomePage = new TrendyolHomePage();

    @And("ilk ürünü sepete ekler")
    public void ilkÜrünüSepeteEkler() throws InterruptedException{

      ReusablaMethods.clickElementWithJS(trendyolHomePage.ilkUrün);
      Thread.sleep(2000);
      ReusablaMethods.closeLocationPopup();
      Thread.sleep(2000);

      ReusablaMethods.clickElementWithJS(trendyolHomePage.basketButton);


    }


    @Then("sepetteki ürün sayısı {string} olmalıdır")
    public void sepettekiÜrünSayısıOlmalıdır(String expectedCount) {

        String actualCount = trendyolHomePage.getCartItemCount();
        Assert.assertEquals(expectedCount,actualCount);
    }
}
