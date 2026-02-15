package ClassPractice.PageobjectModule.DriverrManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddtoCart_Tc02
{
    public static By Cart=By.id("add-to-cart-sauce-labs-backpack");

    public static void Addtocart(WebDriver driver)
    {
        driver.findElement(Cart).click();
    }
}
