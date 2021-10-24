package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Random;

public class SecondPage {

    private WebDriver driver;
    private By secondPage = By.xpath("//span[contains(text(),'Sonraki')]");
    private By productList = By.xpath("//body/div[@id='__next']/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]");
    private By getProduct = By.xpath("//body/div[@id='__next']/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/ul[1]/li[2]/article[1]/div[1]");
    private By clickProduct = By.xpath("//body/div[@id='__next']/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/ul[1]/li[2]/article[1]/div[1]");
    public SecondPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnSecondPage() {
        driver.findElement(secondPage).click();
    }

    public String getSecondPageUrl() {
        return driver.getCurrentUrl();
    }

    public void selectRandomProduct(){

        List<WebElement> allProducts = driver.findElements(By.xpath("//ul[contains(@class,'sc-1yvp483-0')]/li//a"));

        Random rand = new Random();
        int randomProduct = rand.nextInt(allProducts.size());
        for(int i=0;i<=randomProduct;i++) {

            System.out.println(allProducts.get(i));
            String geting = allProducts.get(i).getText();
            //please add your file path
            File file = new File(
                    "C:\\Users\\asus\\Downloads\\PageObjectModel-master\\TestiniumProject\\src\\test\\resources\\File\\product.txt");
            try {
                FileWriter fw = new FileWriter(file);
                BufferedWriter bfw = new BufferedWriter(fw);
                bfw.write(geting);
                bfw.newLine();
                bfw.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        allProducts.get(randomProduct).click();

    }


}
