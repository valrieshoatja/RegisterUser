package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {

    WebDriver driver = null;

    public WebDriver startBrowser(String browserName, String url) {

        if (browserName.equalsIgnoreCase("chrome")) {

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito");
            driver = new ChromeDriver();   // Selenium Manager handles driver automatically

        } else if (browserName.equalsIgnoreCase("firefox")) {

            driver = new FirefoxDriver();

        } else if (browserName.equalsIgnoreCase("safari")) {

            driver = new SafariDriver();

        } else {

            driver = new EdgeDriver();
        }

        driver.manage().window().maximize();
        driver.get(url);
        return driver;
    }
}