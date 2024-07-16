package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.SecureRandom;
import java.sql.Driver;

public class testingCreatingNewAccount {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        Thread.sleep(1000);
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        String title1 = driver.getTitle();
        System.out.println(title1);
        System.out.println("*******************");
        String randomEmail = generateRandomEmail();
        System.out.println("*******************");
        System.out.println("Generated Email: " + randomEmail);
        System.out.println("*******************");
        By signinLink = By.id("signinLink");
        WebElement signinLinkElement = driver.findElement(signinLink);
        signinLinkElement.click();

        Thread.sleep(1000);

        By newAccountBtn = By.id("newAccountBtn");
        WebElement newAccountBtnElement = driver.findElement(newAccountBtn);
        newAccountBtnElement.click();

        By name = By.name("name");
        WebElement nameElement = driver.findElement(name);
        nameElement.sendKeys("test");

        By email = By.name("email");
        WebElement emailElement = driver.findElement(email);
        emailElement.sendKeys("test@test.com");

        By password = By.name("password");
        WebElement passwordElement = driver.findElement(password);
        passwordElement.sendKeys("qwertyu12345!@#ASDF");

        By confirmPassword = By.name("confirmPassword");
        WebElement confirmPasswordElement = driver.findElement(confirmPassword);
        confirmPasswordElement.sendKeys("qwertyu12345!@#ASDF");

        Thread.sleep(1000);

        By signupBtn = By.id("signupBtn");
        WebElement signupBtnElement = driver.findElement(signupBtn);
        signupBtnElement.click();

        Thread.sleep(1000);

        String errorText = driver.findElement(By.className("error")).getText();
        System.out.println("*******************");
        System.out.println("Error Message desplaied = " + errorText);

        driver.quit();









    }

    private static String generateRandomEmail() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        SecureRandom random = new SecureRandom();
        StringBuilder email = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            email.append(characters.charAt(random.nextInt(characters.length())));
        }
        email.append("@abc.com");
        return email.toString();
    }
}
