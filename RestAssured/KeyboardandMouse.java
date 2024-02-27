package TestCase.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class KeyboardandMouse {

    public static void keyboardMouse()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lathe\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/test/newtours/");
        WebElement link_home = driver.findElement(By.linkText("Home"));
        WebElement td_home = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font/a"));

        Actions builder = new Actions(driver);

        Action mouseoverhome = (Action) builder.moveToElement(link_home).build();




    }
}
