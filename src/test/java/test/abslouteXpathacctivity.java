package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class abslouteXpathacctivity {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");

        boolean passed = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[3]/div/div[1]/img")).isDisplayed();
        System.out.println(passed);
        driver.quit();


    }
}
