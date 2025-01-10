package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParrellTest {


    @Test
    public void openGoogle(){
        System.out.println("openGoogle");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.quit();
    }

    @Test
    public void openBing(){
        System.out.println("openBing");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bing.com");
        driver.quit();
    }

}
