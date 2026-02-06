import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginPage
{
    public static void main(String[] args) throws InterruptedException {
        EdgeDriver driver=new EdgeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        driver.findElement(By.className("submit-button")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
        driver.findElement(By.name("firstName")).sendKeys("Abhi");
        driver.findElement(By.id("last-name")).sendKeys("Patil");
        driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("415142");
        Thread.sleep(1000);
        driver.findElement(By.id("continue")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("finish")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("back-to-products")).click();
    }
}
