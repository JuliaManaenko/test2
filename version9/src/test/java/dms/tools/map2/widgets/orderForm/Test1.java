package dms.tools.map2.widgets.orderForm;

import dms.tools.map2.dws.Orderdws;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.PropertyLoader;

/**
 * Created by Julia on 10.04.2017.
 */
public class Test1 extends TestBase{

    @Test
    public void getFirstNameText(){
        driver.get(PropertyLoader.loadProperty("url"));
        Orderdws order = PageFactory.initElements(driver, Orderdws.class);
        order.putFirstName();
        Assert.assertEquals(order.getFirstName(), PropertyLoader.loadProperty("firstName"));
    }
}
