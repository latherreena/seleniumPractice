package TestCase.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkandpartialLink {

    public static void linkpartiallink()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lathe\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/link.html");
        //driver.findElement(By.linkText("click here")).click();
      //  driver.findElement(By.partialLinkText("here")).click();

// case-sensitive links:
        /*driver.navigate().to("http://demo.guru99.com/test/newtours/");
        String theLinkText = driver.findElement(By
                        .partialLinkText("egis"))
                .getText();
        System.out.println(theLinkText);
        theLinkText = driver.findElement(By
                        .partialLinkText("EGIS"))
                .getText();
        System.out.println(theLinkText);

        driver.quit();*/

        //inside and outside block
        driver.get("http://demo.guru99.com/test/block.html");
        driver.findElement(By.partialLinkText("Inside")).click();
        System.out.println(driver.getTitle());
        driver.navigate().back();
        driver.findElement(By.partialLinkText("Outside")).click();
        System.out.println(driver.getTitle());
        driver.quit();

    }
}
