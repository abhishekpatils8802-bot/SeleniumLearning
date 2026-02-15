package ClassPractice.PageobjectModule.DriverrManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerDetails {
    public static By Name=By.id("first-name");
    public static By Sirname=By.name("lastName");
    public static By Pincode=By.name("postalCode");
    public static By Continueee =By.id("continue");


    public static void Details(WebDriver driver, String Firstname, String Lastname, int PostalCode)
    {
        driver.findElement(Name).sendKeys(Firstname);
        driver.findElement(Sirname).sendKeys(Lastname);
        driver.findElement(Pincode).sendKeys(String.valueOf(PostalCode));
        driver.findElement(Continueee).click();
    }
}
