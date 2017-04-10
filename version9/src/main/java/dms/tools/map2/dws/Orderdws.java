package dms.tools.map2.dws;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.PropertyLoader;

/**
 * Created by Julia on 10.04.2017.
 */
public class Orderdws  extends Page{
    public Orderdws(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(how = How.NAME, using = "first_name")
    private WebElement firstNameInput;

    public void putFirstName(){
        firstNameInput.sendKeys(PropertyLoader.loadProperty("firstName"));
    }

    public String getFirstName(){
        return firstNameInput.getAttribute("value");
    }
}
