package steps;

import com.thoughtworks.gauge.Step;
import org.apache.log4j.LogManager;
import pages.AddToBasketPage;
import qa.factory.DriverFactory;

public class AddToBasketSteps{

    public static org.apache.log4j.Logger logger = LogManager.getLogger(AddToBasketSteps.class);

    private AddToBasketPage addToBasketPage = new AddToBasketPage(DriverFactory.webDriver);

    @Step("Closed policy alert")
    public void closed_policy_alert(){
        addToBasketPage.closedPolicy();
    }

    @Step("Add to basket")
    public void add_to_basket() {
        addToBasketPage.addToBasket();

    }

    @Step("Click to basket")
    public void click_to_basket() {
        addToBasketPage.clickToBasket();
    }

    @Step("Driver wait")
    public void driver_wait() throws InterruptedException{
        Thread.sleep(5000);
        addToBasketPage.Wait();
    }

    @Step("page price and basket price should be equals")
    public void page_url_should_be() {
        addToBasketPage.isEqual();
        logger.info("The Prices are equal");
    }

    @Step("Increase basket count")
    public void increase_basket_count(){
        addToBasketPage.increaseBasket();
    }

    @Step("Should be basket count two")
    public void should_be_basket_count(){
        addToBasketPage.countBasket();
    }

    @Step("Delete items in basket")
    public void delete_items_in_basket(){
        addToBasketPage.deleteBasket();
    }

    @Step("Should be basket is empty")
    public void should_be_basket_is_empty(){
        addToBasketPage.basketEmpty();
    }

}
