package ClassPractice.PageobjectModule.DriverrManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ErrorMessageIf {
    public static By Err=By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3");
    public static String getErrMessage(WebDriver driver)
    {
        String errmessage=driver.findElement(Err).getText();
        return errmessage;
    }
}
