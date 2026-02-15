package ClassPractice.PageobjectModule.DriverrManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FinalFinish {
    public static By Finish=By.id("finish");
    public static void Finish(WebDriver driver)
    {
        driver.findElement(Finish).click();
    }
}
