package steps;

import com.thoughtworks.gauge.Step;
import org.apache.log4j.Logger;
import org.junit.Assert;
import pages.SecondPage;
import qa.factory.DriverFactory;

public class SecondPageSteps {
    public static org.apache.log4j.Logger logger = Logger.getLogger(SecondPageSteps.class);
    private static String url;
    private SecondPage secondPage = new SecondPage(DriverFactory.webDriver);

    @Step("User click on second page")
    public void user_click_on_second_page(){
        secondPage.clickOnSecondPage();
    }

    @Step("User gets the url of the page")
    public void user_gets_the_url_of_the_page() {
        url = secondPage.getSecondPageUrl();
        System.out.println("Page url is: " + url);
        logger.info("Link Checked");
    }

    @Step("Page link should be <expectedUrl>")
    public void page_url_should_be(String expectedUrl) {
        Assert.assertTrue(url.contains(expectedUrl));
    }

    @Step("Product random click")
    public void product_random_click(){
        secondPage.selectRandomProduct();
    }



}
