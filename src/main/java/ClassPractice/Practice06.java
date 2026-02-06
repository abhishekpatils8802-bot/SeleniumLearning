package ClassPractice;

import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class Practice06 {
    public static void main(String[] args)
    {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

    }

}
