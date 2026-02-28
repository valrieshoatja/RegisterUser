package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    WebDriver driver;

    @FindBy(xpath = "//button[contains(@class,'nav-dropdown-trigger')]")
    WebElement learnDropdownXpath;

    @FindBy(xpath = "//span[text()='Learning Materials']")
    WebElement learningMaterialsXpath;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickLearnDropdown() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(learnDropdownXpath));
        learnDropdownXpath.click();
    }

    public void clickLearningMaterials() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(learningMaterialsXpath));
        learningMaterialsXpath.click();
    }

    public boolean isLearningMaterialsVisible() {
        try {
            return learningMaterialsXpath.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}