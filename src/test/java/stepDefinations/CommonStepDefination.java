package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.TrendyolHomePage;
import utils.ConfigReader;
import utils.Driver;

public class CommonStepDefination {

    private TrendyolHomePage trendyolHomePage = new TrendyolHomePage();

    @Given("Kullanıcı trenyol {string} e gider")
    public void trendyol_ana_sayfası_acılır(String urlKey) {
        // Write code here that turns the phrase above into concrete actions
        String url = ConfigReader.getProperty(urlKey);
        Driver.getDriver().get(url);

    }

    @When("kullanıcı arama cubuguna {string} yazar ve enter'a basar")
    public void kelimesi_arama_cubuğuna_yazılır_ve_enter_a_basılır(String string) {
        // Write code here that turns the phrase above into concrete actions
        trendyolHomePage.searchButton.sendKeys("laptop");
        trendyolHomePage.searchButton.sendKeys(Keys.ENTER);


    }

}
