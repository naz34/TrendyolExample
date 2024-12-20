package utils;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class ReusablaMethods {

    private static WebDriverWait getWait(WebDriver driver, int timeoutInSeconds) {
        return new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
    }

    public static void clickElementWithJS(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", element);
    }


    public static void verifyElementIsVisible(WebElement element){
        getWait(Driver.getDriver(), 10).until(ExpectedConditions.visibilityOf(element));
        Assert.assertTrue("Element is not visible!", element.isDisplayed());
    }

    public static void closeLocationPopup() {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
            WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Anladım']")));
            closeButton.click();
            System.out.println("Pop-up başarıyla kapatıldı.");
        } catch (TimeoutException e) {
            System.out.println("Konum pop-up'ı çıkmadı veya zaman aşımına uğradı.");

            // Hata sırasında ekran görüntüsü al
            try {
                File screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(screenshot, new File("screenshot.png"));
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }










}
