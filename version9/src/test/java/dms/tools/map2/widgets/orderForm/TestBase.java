package dms.tools.map2.widgets.orderForm;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import utility.WebDriverFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by Julia on 10.04.2017.
 */
public class TestBase {

    protected WebDriver driver;

    @BeforeClass
    @Parameters({"browserName"})
    public void setup(String browserName) throws Exception {
        driver = WebDriverFactory.getInstance(browserName);
        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            WebDriverFactory.killDriverInstance();
        }
    }
}
