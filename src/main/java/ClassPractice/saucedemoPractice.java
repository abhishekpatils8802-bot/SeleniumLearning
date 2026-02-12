package ClassPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class saucedemoPractice {
    public static void main(String[] args) {
        EdgeDriver driver=new EdgeDriver();
        OpenUrl(driver,"https://www.saucedemo.com/");
        Maximize(driver);
       Login(driver,"standard_user","secret_sauce");
     //  Login(driver,"","");
//       String errmessage=getErrMessage(driver);
//        System.out.println(errmessage);
        Addtocart(driver);
        Cart(driver);
        Checkout(driver);
        Details(driver,"Abhishek","Patil",415212);
        Finish(driver);
    }
    /*
    method for url
     */
    public static void OpenUrl(WebDriver driver,String url)
    {
        driver.get(url);
    }
    /*
    method for maximize window
     */
    public static void Maximize(WebDriver driver)
    {
        driver.manage().window().maximize();
    }
    /*
    method for login page
     */
    public static void Login(WebDriver driver,String username,String Password)
    {
    driver.findElement(By.id("user-name")).sendKeys(username);
    driver.findElement(By.name("password")).sendKeys(Password);
    driver.findElement(By.id("login-button")).click();
    }

    /*
    method for get err message
     */
//    public static String getErrMessage(WebDriver driver)
//    {
//        String errmessage=driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
//        return errmessage;
//    }
     public static void Addtocart(WebDriver driver)
    {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }
    public static void Cart(WebDriver driver){
         driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).click();
    }
    public static void Checkout(WebDriver driver){
         driver.findElement(By.name("checkout")).click();
    }
    public static void Details(WebDriver driver,String Firstname,String Lastname,int PostalCode)
    {
         driver.findElement(By.id("first-name")).sendKeys(Firstname);
         driver.findElement(By.name("lastName")).sendKeys(Lastname);
         driver.findElement(By.name("postalCode")).sendKeys(String.valueOf(PostalCode));
         driver.findElement(By.id("continue")).click();
    }
    public static void Finish(WebDriver driver)
    {
         driver.findElement(By.id("finish")).click();
    }
}
