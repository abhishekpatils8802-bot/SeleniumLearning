package ClassPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginPageMethods
{
    public static void main(String[] args)
    {
        //calling Method for URL
        ChromeDriver driver=new ChromeDriver();
        openurl(driver,"https://www.saucedemo.com/");
        //calling method for window
        maximizewindow(driver);
        //Login page username and password
        login(driver,"" ,"");
        //cart page.
        CartCheck(driver,"click");

    }
    public static void openurl(WebDriver driver, String url){
        driver.get(url);
    }
    public static void maximizewindow(WebDriver driver){
        driver.manage().window().maximize();
    }
    public static void login(WebDriver driver,String username,String Password){
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        driver.findElement(By.className("submit-button")).click();
        driver.findElement(By.className("submit-button")).click();
    }
   public static void  CartCheck(WebDriver driver,String AddTocart)
   {
       driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
       driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).click();
   }
}
