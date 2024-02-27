package TestCase.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XPath {
    public static void edgebrowser() throws InterruptedException {
        //System.setProperty("webdriver.edge.driver", "C:\\Users\\Bhara\\edgedriver_win64\\msedgedriver.exe") ;
        //Launch the browser - by creating an object of webdriver interface
        WebDriver driver = new FirefoxDriver();// webDriver is interface which implementing in chromedriver class.
        driver.get("https://www.orangehrm.com/en/30-day-free-trial");//open the url
        // driver.findElement(By.tagName("input"));//driver is object, find element-method, parameters)
        // driver.quit();dxxzzxxxcvvgvgvcbvv;l./lhjkkl;'l'l;l;'opl;'l;bigfdryhiuiouiopp[8b
    }

    public static void relativeXpath() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lathe\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/test/selenium-xpath.html");
        //driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("reema");
       // driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234");
       /* driver.findElement(By.xpath("//*[contains(@type, 'submit')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(@name, 'btnReset')]")).click();*/

        //driver.findElement(By.xpath("//input[@type='submit' or @value = 'RESET']")).click(); // use or , AND TO FIND THE elements
       // driver.findElement(By.xpath("//input[@type ='reset' and @value = 'RESET']")).click();

       // driver.findElement(By.xpath("//label[starts-with(@id, 'message')]")); // use starts-with to find element when the values are dynamic

        //driver.findElement(By.xpath("//td[text()='UserID']")); //to find text element on web

        //driver.findElement(By.xpath("//*[@type = 'text']//following::input[2]")).click();// after text when we find similar input tags then we use this.
        // driver.findElement(By.xpath("//*[text() = 'Enterprise Testing']//ancestor::div[3]")).click(); // find out all ancestor of the div tag
       // driver.findElement(By.xpath("//*[@id = 'java_technologies']//child::li[1]")).click();// find all the child element of the li tag
       // driver.findElement(By.xpath("//*[@type = 'submit']//preceding::input")).click();// to find element before submit text
       // driver.findElement(By.xpath("//*[@type='submit']//following-sibling::input")).click(); //to find element after type and of tag
        /*WebElement abc = driver.findElement(By.xpath("//*[@class='canvas-middle']//parent::div"));
        abc.click();
        System.out.println(abc);*/
       // driver.findElement(By.xpath("//*[@type = 'password']//self::input")).click(); // to find self element using tagname at the end
        driver.findElement(By.xpath("//*[@class = 'canvas-middle']//descendant::a")).getLocation();






    }
}
