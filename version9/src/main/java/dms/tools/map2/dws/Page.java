package dms.tools.map2.dws;

import org.openqa.selenium.WebDriver;

/**
 * Created by Julia on 10.04.2017.
 */
public class Page {
    protected WebDriver driver;

	/*
	 * Constructor injecting the WebDriver interface
	 *
	 * @param webDriver
	 */

    public Page(WebDriver webDriver) {
        this.driver = webDriver;
    }

    public WebDriver getWebDriver() {
        return driver;
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public String getPageUrl() {
        String pageUrl = driver.getCurrentUrl();
        return pageUrl;
    }
}
