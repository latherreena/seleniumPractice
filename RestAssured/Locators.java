package TestCase.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

    public static void facebook()
    {
        // Set webdriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lathe\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //set out variables
        String baseURL = "https://www.google.com/";
        String tagName = "";
        // launch driver
        driver.get(baseURL);
        //action to test the elements
        tagName = driver.findElement(By.name("login")).getTagName();
        System.out.println(tagName);
        driver.findElement(By.name("login")).click();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.navigate().to("https://en.wikipedia.org/wiki/Bharat");
        //driver.close();
        driver.quit();
    }

    public static void seleniumWebdriver()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lathe\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // driver.get("http://demo.guru99.com/test/newtours/");
        driver.get("http://demo.guru99.com/selenium/deprecated.html");
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        actualTitle = driver.getTitle();
        /*String wb= driver.getPageSource();
        System.out.println(wb);*/
        String gh = driver.getCurrentUrl();
        System.out.println(gh);

        driver.switchTo().frame("classFrame");
        driver.findElement(By.linkText("Deprecated")).click();

        driver.get("http://jsbin.com/usidix/1");
        driver.findElement(By.cssSelector("input[value = \"Go!\"]")).click(); // manually added path
        String alertMessage = driver.switchTo().alert().getText();
        System.out.println(alertMessage);
        driver.switchTo().alert().accept();

        if (actualTitle.contains(expectedTitle))
        {
            System.out.println("passed");
        }
        else
        {
            System.out.println("failed");
        }
        // driver.close();
    }
}
