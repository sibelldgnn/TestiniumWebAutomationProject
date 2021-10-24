package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    private WebDriver driver;
    private By clickOnSearchBox =By.xpath("//header/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]");
    private By computer = By.xpath("//header/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]");
    private By  clickOnSearchButton = By.cssSelector("[data-cy='search-find-button']");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getLoginPageTitle() {
        return driver.getTitle();
    }

    public void clickOnSearchBox() {
        driver.findElement(clickOnSearchBox).click();
    }

    public void sendToElement(String pc) {
        driver.findElement(computer).sendKeys(pc);
    }

    public void clickOnSearchButton() {
        driver.findElement(clickOnSearchButton).click();
    }

}


