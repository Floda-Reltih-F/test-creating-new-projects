package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class purchaseAcctivity {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        Thread.sleep(1000);

        driver.get("https://retail.tekschool-students.com/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[3]/div/div[2]/div[1]/div[1]/div/div/div[2]/img")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[3]/div/div[9]/img")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[3]/div/div[1]/div[3]/div/div/select")).sendKeys("4");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[3]/div/div[1]/div[3]/div/button/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[1]/div[3]/p")).click();
        Thread.sleep(1000);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        String tittle = driver.getTitle();
        System.out.println(tittle);
        Thread.sleep(1000);
        driver.quit();




    }
}
