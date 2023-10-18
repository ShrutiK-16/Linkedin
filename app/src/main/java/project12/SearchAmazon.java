package project12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchAmazon {
    ChromeDriver driver;

    public SearchAmazon(){
         System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void endTest()
    {
        System.out.println("End Test: TestCases02");
        driver.close();
        driver.quit();

    }

    public void testCase02() throws InterruptedException{
        driver.get("https://www.google.com/");
        WebElement element =  driver.findElement(By.id("APjFqb"));
        element.sendKeys("Amazon");
        element.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        Boolean value1 = driver.findElement(By.xpath("//*[text()='https://www.amazon.in']")).isDisplayed();
        Boolean value2 = driver.findElement(By.xpath("//*[text()='https://www.amazon.com']")).isDisplayed();
        if(value1 & value2){
            System.out.println("Test case passed");
        }
    }
    
}
