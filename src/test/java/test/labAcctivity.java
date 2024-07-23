package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class labAcctivity {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver  = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/auth/login");
        Thread.sleep(1000);
        driver.findElement(By.id("email")).sendKeys("asd@asd.com");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("123$Qwer");
        Thread.sleep(1000);
        driver.findElement(By.id("loginBtn")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("accountLink")).click();
        Thread.sleep(1000);

        WebElement phoneELement = driver.findElement(By.id("personalPhoneInput"));
        phoneELement.clear();
                phoneELement.sendKeys("571 766 8899");
        Thread.sleep(1000);
        driver.findElement(By.id("personalUpdateBtn")).click();
        Thread.sleep(1000);
        driver.wait();

       boolean isToastDesplayed = driver.findElement(By.cssSelector(".Toastify div.Toastify__toast-body > div:last-child")).isDisplayed();
        driver.wait();
        System.out.println(isToastDesplayed);

        driver.manage().window().maximize();
        driver.wait();

        driver.quit();

    }
}
