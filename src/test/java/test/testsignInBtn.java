package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testsignInBtn {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
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
        emailInputElement.sendKeys("aaabbbcccDTEST@abc.com");

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
}
