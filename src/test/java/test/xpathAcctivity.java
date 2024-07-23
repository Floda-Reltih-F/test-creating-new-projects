package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathAcctivity {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
     // <img src="/images/hero-image.avif" class="home__hero-image" id="heroImage" alt="imgae 1">
        Thread.sleep(1000);
        driver.get("https://amazon.com");
        Thread.sleep(1000);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[7]/div/div[2]/div/div[1]")).click();
        Thread.sleep(1000);
        String tittle = driver.getTitle();
        System.out.println(tittle);

        driver.quit();
    }
}
