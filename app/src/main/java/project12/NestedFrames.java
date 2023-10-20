package project12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedFrames {
    
     ChromeDriver driver;
    public NestedFrames(){
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }
    public void testCase01(){
        driver.get("https://www.google.com/");
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-left']")));
        WebElement element = driver.findElement(By.tagName("body"));
        String leftText = element.getText();
        System.out.println("Left frame text is :"+leftText);
        driver.switchTo().parentFrame();

        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));
        WebElement element2 = driver.findElement(By.tagName("body"));
        System.out.println("Middle frame text is :"+element2.getText());
        driver.switchTo().parentFrame();

        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-right']")));
        WebElement element3 = driver.findElement(By.tagName("body"));
        System.out.println("Right frame text is :"+element3.getText());
        driver.switchTo().defaultContent();

        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-bottom']")));
        WebElement element4 = driver.findElement(By.tagName("body"));
        System.out.println("Bottom frame text is :"+element4.getText());  
        driver.switchTo().defaultContent();
     }
}
