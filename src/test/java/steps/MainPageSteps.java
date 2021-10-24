package steps;

import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import pages.MainPage;
import qa.factory.DriverFactory;

public class MainPageSteps {

    private static String title;
    private MainPage mainPage = new MainPage(DriverFactory.webDriver);


    @Step("User gets the title of the page")
    public void user_gets_the_title_of_the_page() {
        title = mainPage.getLoginPageTitle();
        System.out.println("Page title is: " + title);
    }

    @Step("Page title should be <expectedTitleName>")
    public void page_title_should_be(String expectedTitleName) {
        Assert.assertTrue(title.contains(expectedTitleName));
    }

    @Step("User click on search box")
    public void user_click_on_search_box(){
        mainPage.clickOnSearchBox();
    }

    @Step("User send to <bilgisayar> to the search box")
    public void user_send_to_element(String pc){
        mainPage.sendToElement(pc);
    }

    @Step("User click on search button")
    public void user_click_on_search_button(){
        mainPage.clickOnSearchButton();
    }


}
