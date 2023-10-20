package project12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Imdbrating {

     ChromeDriver driver;

    public Imdbrating(){
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
        driver.get("https://www.imdb.com/chart/top");
        Select dropdown = new Select(driver.findElement(By.id("sort-by-selector")));
        dropdown.selectByVisibleText("IMDb rating");
        System.out.println("Hightest rated movie is : "+driver.findElement(By.className("ipc-title__text")).getText());
        List<WebElement> elements = driver.findElements(By.className("ipc-title__text"));
        int count=0;
        for(int i=0; i<elements.size(); i++){
            count++;
        }
        System.out.println("Total no of movies present are : "+count);
        dropdown.selectByVisibleText("Release date");
        
    }
}
