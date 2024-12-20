package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Driver;

import java.time.Duration;

public class TrendyolHomePage {

    public TrendyolHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public String getCartItemCount() {
        return basketItem.getText();
    }





    @FindBy(xpath = "//input[@placeholder='Aradığınız ürün, kategori veya markayı yazınız']")
    public WebElement searchButton;

    @FindBy(xpath = "//h1[normalize-space()='laptop']")
    public WebElement laptopText;

    @FindBy(xpath = "//div[@title='IdeaPad1 Intel Celeron N4020 4GB 128GB SSD Windows 11 15.6\" Cloud Grey Dizüstü Bilgisayar']//div[@class='product-card-grid-layout']//div[3]")
    public WebElement ilkUrün;

    @FindBy(xpath = "//div[@class='add-to-basket-button-text']")
    public WebElement basketButton;

    @FindBy(xpath = "//div[@class='basket-item-count-container visible']")
    public WebElement basketItem;


}
