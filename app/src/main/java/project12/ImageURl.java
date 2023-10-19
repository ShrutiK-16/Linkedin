package project12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageURl {
     ChromeDriver driver;
    public ImageURl(){
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
        driver.get("https://in.bookmyshow.com/explore/home/chennai");
        List<WebElement> elements = driver.findElements(By.xpath("//img[@width='100%']"));
        for(int i=0; i<elements.size() ; i++){
            System.out.println("URL is: "+elements.get(i).getAttribute("src"));
        }

    }
    
}
