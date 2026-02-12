package ClassPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class callByRef {
    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        openurl(driver,"https://www.youtube.com/watch?v=cYOB941gyXI&list=RDlpdRqn6xwiM&index=4");
       MaximizeWinndow(driver);
      run(driver);
    }
    public static void openurl(ChromeDriver driver,String Url){
        driver.get(Url);
    }
    public static void MaximizeWinndow(ChromeDriver driver){
        driver.manage().window().maximize();
    }
    public static void run(ChromeDriver driver){
        driver.findElement(By.xpath("//*[@id=\"video-title\"]")).click();
    }

}
