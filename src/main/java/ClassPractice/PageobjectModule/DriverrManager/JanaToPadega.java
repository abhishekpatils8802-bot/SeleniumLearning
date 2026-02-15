package ClassPractice.PageobjectModule.DriverrManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JanaToPadega {
    public static By Home=By.name("back-to-products");

    public static void BacktoHome(WebDriver driver)
    {
        driver.findElement(Home).click();
    }
}
