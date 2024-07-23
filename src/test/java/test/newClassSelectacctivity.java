package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;

public class newClassSelectacctivity {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();


        driver.get("https://retail.tekschool-students.com/selenium/dropdown");

        Thread.sleep(2000);
        WebElement element = driver.findElement(By.id("languageSelect"));

        Select select = new Select(element);

        select.selectByIndex(4);

        driver.manage().window().maximize();

       boolean passed =  element.isDisplayed();
        System.out.println(passed);

        driver.quit();




    }
}
