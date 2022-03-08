import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestSuit{
    WebDriver driver;
        long endTime;
        long startTime;
    @BeforeSuite
    public void openBrowser(){
        startTime = System.currentTimeMillis();
        System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver.exe");
        driver = new ChromeDriver();

    }

    @Test
    public void openGoogle(){
        driver.get("https://www.google.com/");

    }
    @Test
     public void openYahoo(){
        driver.get("https://www.yahoo.com/");
    }
    @AfterSuite
    void closeBrowser(){
       driver.close();
         endTime = System.currentTimeMillis();
        long totalTime = endTime-startTime;
        System.out.println(" time is "+  totalTime);
    }
}
