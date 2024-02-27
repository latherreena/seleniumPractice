package TestCase.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class cssSelectors {

    public static void cssselector()  {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lathe\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.get("https://www.facebook.com/");
      //  driver.navigate().to("https://demo.guru99.com/test/newtours/index.php");
        //css selectors
       // driver.findElement(By.cssSelector("input#email")).sendKeys("gh@gmail.com"); // "tag#id"
      // driver.findElement(By.cssSelector("input.inputtext")).sendKeys("agb@hm.com"); //"tag.class"
      //  driver.findElement(By.cssSelector("input[data-testid=royal_email]")).sendKeys("er@hj.com"); //"tag[attribute=value]"
      // driver.findElement(By.cssSelector("input.inputtext[data-testid = royal_email")).sendKeys("gj@gmail.com");
       // WebElement text = driver.findElement(By.cssSelector("font:contains('Password:')")); // contains using with css is invalid

       //radio button
      //  driver.findElement(By.cssSelector("input[name=userName]")).sendKeys("Reena");
       // driver.findElement(By.cssSelector("input[name=password]")).sendKeys("Welcome@1234");

        //click radiobutton
        driver.navigate().to("http://demo.guru99.com/test/ajax.html");
        driver.findElement(By.id("no")).click();
        driver.findElement(By.id("buttoncheck")).click();

        //driver.findElement(By.cssSelector("input[name = 'tripType'][value='oneway']")).click(); //not working yet

    }
}
