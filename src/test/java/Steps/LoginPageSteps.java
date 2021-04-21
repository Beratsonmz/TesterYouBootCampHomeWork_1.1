package Steps;

import Factory.DriverFactory;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
    private final LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

    private static String title;

    @Given("User on login page")
    public void userOnLoginPage() {
        DriverFactory.getDriver().get("https://giris.hepsiburada.com/");
    }

    @When("User enters email {string}")
    public void userEntersEmail(String mail) {
        loginPage.setEmail(mail);
    }

    @And("User enters password {string}")
    public void userEntersPassword(String password) {
        loginPage.setPassword(password);
    }

    @Then("User clicks on login button")
    public void userClicksOnLoginButton() {
        loginPage.clickLoginBtn();
    }
}
