package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Locale;
import java.util.Scanner;

public class firefoxDriver {
        public static void main(String[] args) {
            Scanner scObj = new Scanner(System.in);
            System.out.println("please selecet your browser type");
            String bowserType = scObj.next().toLowerCase(Locale.ROOT);
            System.out.println(bowserType + " Selected type");
            WebDriver driver;
            if(bowserType.equals("chrome")){
                driver = new ChromeDriver();
            }else if (bowserType.equals("firefox")){
                driver = new FirefoxDriver();
            }else if (bowserType.equals("edge")){
                driver = new EdgeDriver();
            } else {
                throw new RuntimeException("wrong driver");
            }

            driver.get("https://retail.tekschool-students.com/");
            String title = driver.getTitle();
            System.out.println(title);
           // driver.quit();
            System.out.println("app closed successfully");

            
        }


}
