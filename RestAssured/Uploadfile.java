package TestCase.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Uploadfile
{
    public static void upfile()

{
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\lathe\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://demo.guru99.com/test/upload/");
    WebElement upload = driver.findElement(By.id("uploadfile_0"));

    // enter the file path onto the file-selection input field
    upload.sendKeys("C:\\Users\\lathe\\Downloads\\Data.json");
    // check the "I accept the terms of service" check box
    driver.findElement(By.id("terms")).click();
    // click the "UploadFile" button
    driver.findElement(By.name("send")).click();

}

    public static void downloadfile()

    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lathe\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/yahoo.html");
        WebElement download = driver.findElement(By.id("messenger-download"));

        String sourcelocation = download.getAttribute("href");
        String wgetcommand = "cmd /c C:\\\\Wget\\\\wget.exe -P D"+ sourcelocation;

        try {
            Process exec = Runtime.getRuntime().exec(wgetcommand);
            int exitVal = exec.waitFor();
            System.out.println("Exit value: " + exitVal);
        } catch (InterruptedException | IOException ex) {
            System.out.println(ex.toString());
        }
        driver.close();

    }
}
