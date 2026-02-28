package stepDefinations;

import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.*;
import org.testng.Assert;
import utils.DriverManager;

public class HomeSteps {

    HomePage homePage;
    LoginPage loginPage;

    @Given("User launches the application")
    public void user_launches_the_application() {

        // 🔥 Open your application URL here
        DriverManager.getDriver().get("https://ndosisimplifiedautomation.vercel.app/");

        homePage = new HomePage(DriverManager.getDriver());
        loginPage = new LoginPage(DriverManager.getDriver());
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
    }

    @Then("Learning Materials should not be visible")
    public void learning_materials_should_not_be_visible() {
        Assert.assertFalse(homePage.isLearningMaterialsVisible());
    }
}