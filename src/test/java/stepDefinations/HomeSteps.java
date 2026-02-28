package stepDefinations;

import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.BrowserFactory;

public class HomeSteps {

    WebDriver driver;
    BrowserFactory factory;
    HomePage homePage;
    LoginPage loginPage;

    String url = "https://ndosisimplifiedautomation.vercel.app/";

    @Given("User launches the application")
    public void user_launches_the_application() {

        factory = new BrowserFactory();
        driver = factory.startBrowser("chrome", url);

        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
    }

    @When("User clicks Learn dropdown")
    public void user_clicks_learn_dropdown() {
        homePage.clickLearnDropdown();
    }

    @When("User clicks Learning Materials")
    public void user_clicks_learning_materials() {
        homePage.clickLearningMaterials();
    }

    @Then("Login page should be displayed")
    public void login_page_should_be_displayed() {
        Assert.assertTrue(loginPage.isLoginPageDisplayed());
        driver.quit();
    }

    @Then("Learning Materials should not be visible")
    public void learning_materials_should_not_be_visible() {
        Assert.assertFalse(homePage.isLearningMaterialsVisible());
        driver.quit();
    }
}