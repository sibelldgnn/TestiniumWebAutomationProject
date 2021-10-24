package pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class AddToBasketPage  {

    public static org.apache.log4j.Logger logger = Logger.getLogger(AddToBasketPage.class);
    WebDriverWait wait = null;
    private WebDriver driver = null;

    private By policy = By.xpath("//body/div[3]/div[3]/div[3]/div[1]");
    private By addBasket = By.xpath("//button[normalize-space()='Sepete Ekle']");
    private By pagePrice = By.xpath("//body/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]");
    private By myBasket = By.xpath("//span[text()='Sepetim']");
    private By basketPrice = By.xpath("//body/div[@id='topContainer']/div[@id='GGHeaderWrapper']/div[@id='header_wrapper']/div[4]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/div[2]/p[3]/span[1]");
    private By increaseProduct = By.xpath("//option[contains(text(),'2')]");
    private By basketCount = By.xpath("//body/div[@id='main-content']/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/ul[1]/li[1]/div[1]");
    private By basketDelete = By.xpath("//body/div[@id='main-content']/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/a[1]");
    private By emptyBasket = By.xpath("//h2[contains(text(),'Sepetinizde ürün bulunmamaktadır.')]");

    public AddToBasketPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 60);
    }

    public void closedPolicy() {
        driver.findElement(policy).click();
    }

    public void addToBasket(){
        wait.until(ExpectedConditions.elementToBeClickable(addBasket));
        driver.findElement(addBasket).click();
    }

    public void clickToBasket() {
        wait.until(ExpectedConditions.elementToBeClickable(myBasket));
        driver.findElement(myBasket).click();

    }

    public void Wait() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(250));
    }

    public void isEqual() {
        wait.until(ExpectedConditions.elementToBeClickable(basketPrice));
        Assert.assertEquals(driver.findElement(pagePrice).getText(),driver.findElement(basketPrice).getText());
    }

    public void increaseBasket(){
        scrollToProductCount(increaseProduct);
        driver.findElement(increaseProduct).click();
    }

    public void scrollToProductCount(By increaseProduct) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(increaseProduct));

    }

    public void countBasket(){
        Assert.assertEquals(driver.findElement(basketCount).getText(),"Sepet Tutarı (2 Adet)");
        logger.info("Basket count are 2");
    }

    public void deleteBasket(){
        driver.findElement(basketDelete).click();
    }

    public void basketEmpty(){
        Assert.assertEquals(driver.findElement(emptyBasket).getText(),"Sepetinizde ürün bulunmamaktadır.");
        logger.info("Basket is Empty");
    }

}
