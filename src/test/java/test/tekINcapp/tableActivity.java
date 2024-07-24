package test.tekINcapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableActivity {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://dev.insurance.tekschool-students.com/customer/plans");
        Thread.sleep(1000);
    //    driver.findElement(By.linkText("login")).click();
Thread.sleep(1000);
        driver.findElement(By.name("username")).sendKeys("supervisor");
        Thread.sleep(1000);
        driver.findElement(By.name("password")).sendKeys("tek_supervisor");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/form/div/div[3]/button[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/a[2]")).click();
        Thread.sleep(3000);
       String price1 =  driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[1]/td[3]")).getText();
        System.out.println(price1);
        Thread.sleep(2000);
        String price2 =  driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[2]/td[3]")).getText();
        System.out.println(price2);
        Thread.sleep(2000);
        String price3 =  driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[3]/td[3]")).getText();
        System.out.println(price3);
        Thread.sleep(2000);
        String price4 =  driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[4]/td[3]")).getText();
        System.out.println(price4);
        driver.quit();
        System.out.println("Passed");


    }
}
