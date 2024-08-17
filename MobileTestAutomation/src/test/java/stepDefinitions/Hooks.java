package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.Driver;

import java.net.MalformedURLException;

public class Hooks {
    Driver driver = new Driver();

    @Before
    public void setUp() throws MalformedURLException {
        driver.newSession();
    }

    @After
    public void tearDown() {
        driver.closeDriver();
    }
}
