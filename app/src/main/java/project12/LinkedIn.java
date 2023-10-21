package project12;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkedIn {
    ChromeDriver driver;

    public LinkedIn(){
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
    public void testCase01(){
        driver.get("https://www.google.com/");
        driver.get("https://in.linkedin.com/");
        driver.findElement(By.xpath("//input[@id='session_key']")).sendKeys("helloshruti24@gmail.com");
        driver.findElement(By.xpath("//input[@id='session_password']")).sendKeys("Linkedin@16");
        driver.findElement(By.xpath("//button[@data-id='sign-in-form__submit-btn']")).click();
        driver.findElement(By.xpath("//span[text()='Start a post']")).click();
        driver.findElement(By.className("ql-editor ql-blank")).sendKeys("ABC");
        driver.findElement(By.id("ember336")).click();
    }
    
}
