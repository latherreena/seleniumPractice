package TestCase.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

import javax.swing.*;

public class Tooltip {

    public static void tooltipactionHTMLtitle() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lathe\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();// webDriver is interface which implementing in chromedriver class.
        driver.get("https://demo.guru99.com/test/social-icon.html");//open the url

       // Actions builder = new Actions(driver); // create object of action
       // builder.clickAndHold(slider).moveByOffset(50, 0).release(); // user action
       // Action slideaction = builder.build();
       // slideaction.perform();

        String expectedTooltip = "Github";

        // find the github icon
        WebElement github = driver.findElement(By.xpath("//*[@id=\"page\"]/div[2]/div/a[4]"));

        //get value of title
        String actulalTooltip = github.getAttribute("title");

        //Assert the tooltip's value
        System.out.println(actulalTooltip);
        if (actulalTooltip.equals(expectedTooltip))
        {
            System.out.println("test passed");
        }
        else{
            System.out.println("test failed");
        }
        github.click();

    }

    public static void tooltipJqueryPlugin()
 {
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\lathe\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();// webDriver is interface which implementing in chromedriver class.
     driver.get("https://demo.guru99.com/test/tooltip.html");//open the url

     String expectedresult = "What's new in 3.2";
     WebElement wb = driver.findElement(By.xpath("//*[@id = 'download_now']"));

     Actions builder = new Actions(driver);

     builder.clickAndHold().moveToElement(wb);
     builder.moveToElement(wb).build().perform();

     WebElement tipelement = driver.findElement(By.xpath(".//*[@class='box']/div/a"));
     String actualtip = tipelement.getText();

     System.out.println(actualtip);
     if (actualtip.equals(expectedresult))
     {
         System.out.println("test passed");
     }





 }
}
