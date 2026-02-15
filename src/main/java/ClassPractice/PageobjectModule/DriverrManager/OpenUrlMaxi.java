package ClassPractice.PageobjectModule.DriverrManager;

import org.openqa.selenium.WebDriver;

public class OpenUrlMaxi {
    public static void OpenUrl(WebDriver driver, String url)
    {
        driver.get(url);
    }
    public static void Maximize(WebDriver driver)
    {
        driver.manage().window().maximize();
    }
}
