package Steps;

import Factory.DriverFactory;
import Pages.SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class SearchPageSteps {
    private final SearchPage searchPage = new SearchPage(DriverFactory.getDriver());
    @And("User add related product to cart")
    public void userAddRelatedProductToCart() {
        searchPage.addToCart(1);

    }

    @When("User goes to cart page")
    public void userGoesToCartPage() {
        searchPage.goToCart();
    }
}
