package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickOnTik {
   public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(1000);

        driver.get("https://www.google.com/");
        Thread.sleep(2000);

        driver.findElement(By.id("APjFqb")).sendKeys("Tekschool");
        Thread.sleep(2000);
        driver.findElement(By.name("btnK")).click();

        driver.findElement(By.partialLinkText("TEK SCHOOL Modern Workforce Training Bootcamp")).click();

        driver.manage().window().maximize();

        System.out.println("pssed");




    }
}
