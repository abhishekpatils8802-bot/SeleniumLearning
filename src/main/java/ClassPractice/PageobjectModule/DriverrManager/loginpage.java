package ClassPractice.PageobjectModule.DriverrManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage
{
    WebDriver driver;
    public void LoginPage(WebDriver driver)
    {
    this.driver=driver;
    }
    public static By username= By.id("user-name");
    public static By Password=By.name("password");
    public static By click=By.id("login-button");

    public static void Login(WebDriver driver, String username, String Password)
    {
        driver.findElement(loginpage.username).sendKeys(username);
        driver.findElement(loginpage.Password).sendKeys(Password);
        driver.findElement(loginpage.click).click();
    }
}
