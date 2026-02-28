package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.DriverManager;

public class Hooks {

    @Before
    public void setUp() {
        DriverManager.getDriver();  // Launch browser
    }

    @After
    public void tearDown() {

        // Only wait when debugging
        if (DriverManager.debug) {
            try {
                Thread.sleep(5000);  // 5 seconds pause
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        DriverManager.quitDriver();
    }
}