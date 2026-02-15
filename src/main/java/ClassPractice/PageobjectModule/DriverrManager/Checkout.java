package ClassPractice.PageobjectModule.DriverrManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout {
    public static void Checkout(WebDriver driver){
        driver.findElement(By.name("checkout")).click();
    }
}
