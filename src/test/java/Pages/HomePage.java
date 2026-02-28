package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    WebDriver driver;
    WebDriverWait wait;

    By learnDropdown = By.xpath("//button[contains(@class,'nav-dropdown-trigger') and .//span[text()='Learn']]");
    By dropdownOpen = By.xpath("//div[contains(@class,'nav-dropdown') and contains(@class,'open')]");
    By learningMaterialsBtn = By.xpath("//button[contains(@class,'nav-dropdown-item') and .//span[text()='Learning Materials']]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickLearnDropdown() {
        wait.until(ExpectedConditions.elementToBeClickable(learnDropdown)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(dropdownOpen));
    }

    public void clickLearningMaterials() {
        wait.until(ExpectedConditions.elementToBeClickable(learningMaterialsBtn)).click();
    }


    public boolean isLearningMaterialsVisible() {
        try {
            return driver.findElement(learningMaterialsBtn).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}