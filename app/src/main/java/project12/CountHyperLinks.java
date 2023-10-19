package project12;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountHyperLinks{
    ChromeDriver driver;
    public CountHyperLinks(){
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
        int count = driver.findElements(By.tagName("a")).size();
        System.out.println("Count of hyperlink: "+count);

    }
}