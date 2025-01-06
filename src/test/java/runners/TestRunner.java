package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // Feature dosyalarının yolu
        glue = {"stepDefinations"},       // Step Definitions ve gerekli class'ların yolu
        plugin = {
                "pretty",                           // Konsol çıktısını daha okunabilir hale getirir
                "html:target/cucumber-reports.html", // HTML raporu oluşturur
                "json:target/cucumber-reports.json",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"// Allure raporu için
        },
        monochrome = true,   // Konsol çıktısını daha okunabilir hale getirir
        dryRun = false
)
public class TestRunner {
}
