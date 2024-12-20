package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.TrendyolHomePage;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusablaMethods;

public class SearchProductStepDefinations {

    private TrendyolHomePage trendyolHomePage = new TrendyolHomePage();




    @Then("Sonuclarda {string} kelimesi görünür oldugu kontrol edilir")
    public void sonuclarda_kelimesi_görünür(String expectedText) {
        // Write code here that turns the phrase above into concrete actions
        ReusablaMethods.verifyElementIsVisible(trendyolHomePage.laptopText);

    }



}
