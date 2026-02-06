import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeliniumFirstclasspractice
{
    public static void main(String[] args) throws InterruptedException
    {
        EdgeDriver driver1=new EdgeDriver();
        driver1.get("https://www.youtube.com/watch?v=QJwu2BMnf2I&list=RDQJwu2BMnf2I&start_radio=1");
      //  driver1.manage().window().maximize();
       // driver1.findElement(By.className("video-stream html5-main-video")).click();

    }
}
