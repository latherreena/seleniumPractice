package TestCase.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadiobuttonCheckBox {

    public static void radiobtnChckBox() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lathe\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/radio.html");

        //radiobutton
        WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
        WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
        radio1.click();
        Thread.sleep(2000);
        radio2.click();

        //checkbox
        WebElement option1 = driver.findElement(By.id("vfb-6-0"));
        option1.click();
        
        /*for (int i = 0; i<2; i++)
        {
            checkbox.click();
            System.out.println(checkbox.isSelected());
        }*/


    }
}
