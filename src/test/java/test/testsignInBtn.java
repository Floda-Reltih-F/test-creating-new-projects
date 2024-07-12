package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.SecureRandom;

public class testsignInBtn {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        String randomEmail = generateRandomEmail();
        System.out.println("Generated Email: " + randomEmail);

        By signinLink = By.id("signinLink");
        WebElement signinLinkElement = driver.findElement(signinLink);
        signinLinkElement.click();

        String title = driver.getTitle();
        System.out.println(title);

        By newAccountBtn = By.id("newAccountBtn");
        WebElement newAccountBtnElement = driver.findElement(newAccountBtn);
        newAccountBtnElement.click();

        By nameInput = By.id("nameInput");
        WebElement nameInputElement = driver.findElement(nameInput);
        nameInputElement.sendKeys("abcTEST");

        By emailInput = By.id("emailInput");
        WebElement emailInputElement = driver.findElement(emailInput);
        emailInputElement.sendKeys(randomEmail);

        By passwordInput = By.id("passwordInput");
        WebElement passwordInputElement = driver.findElement(passwordInput);
        passwordInputElement.sendKeys("1abcTEST@abc@@com");

        By confirmPasswordInput = By.id("confirmPasswordInput");
        WebElement confirmPasswordInputElement = driver.findElement(confirmPasswordInput);
        confirmPasswordInputElement.sendKeys("1abcTEST@abc@@com");

        By signupBtn = By.id("signupBtn");
        WebElement signupBtnElement = driver.findElement(signupBtn);
        signupBtnElement.click();

        Thread.sleep(3000);

        By profileImage = By.id("profileImage");
        WebElement profileImageElement = driver.findElement(profileImage);
        System.out.println(profileImageElement.isDisplayed());
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
