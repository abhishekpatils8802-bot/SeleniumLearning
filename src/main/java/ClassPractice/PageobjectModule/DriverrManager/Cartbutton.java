package ClassPractice.PageobjectModule.DriverrManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cartbutton {
    public static void Cart(WebDriver driver)
    {
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).click();
    }
}
