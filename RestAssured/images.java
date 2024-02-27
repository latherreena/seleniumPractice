package TestCase.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class images {

    public static void imageclick()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lathe\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.guru99.com/click-on-image-in-selenium.html");
        WebElement image = driver.findElement(By.cssSelector("img[alt=Guru99]"));
        image.click();

        if (driver.getTitle().isEmpty()){
            System.out.println("False");
            }
        else {
            System.out.println("true");
        }


    }
}
