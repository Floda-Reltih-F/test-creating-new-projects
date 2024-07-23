package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.List;

public class bbclinks {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(1000);

        driver.get("https://bbc.com");
     //   driver.manage().window().maximize();
        Thread.sleep(3000);

        By imageTag = By.tagName("img");
        Thread.sleep(1000);

         List<WebElement> imageTagElements = driver.findElements(imageTag);
        Thread.sleep(1000);

        for(WebElement element : imageTagElements){
            System.out.println(element.getSize());
        }

        System.out.println(imageTagElements.size());


        driver.quit();


    }
}
