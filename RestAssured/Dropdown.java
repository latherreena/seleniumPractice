package TestCase.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

    public static void drpdown()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lathe\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");

        //call select class here

        Select drpcountry = new Select(driver.findElement(By.name("country")));
        drpcountry.selectByVisibleText("Maxico");



    }
}
