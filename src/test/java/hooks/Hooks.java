package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.BrowserFactory;
import utils.DriverManager;

public class Hooks {

    @Before
    public void setUp() {

        DriverManager.setDriver(
                BrowserFactory.startBrowser(
                        "edge",
                        "https://ndosisimplifiedautomation.vercel.app/"
                )
        );
    }

    @After
    public void tearDown() {
        DriverManager.quitDriver();
    }
}