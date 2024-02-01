package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebBrowserSeleniumTest {

    public static void main(String[] args)
    {
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhara\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe") ;
        //Launch the browser - by creating an object of webdriver interface
        WebDriver driver = new ChromeDriver();// webDriver is interface which implementing in chromedriver class.
        driver.get("https://www.orangehrm.com");//open the url
        driver.manage().window().maximize(); // to maximise the screen

        //locators
        driver.findElement(By.id("Form_submitForm_action_request")).click();//driver is object, find element-method, parameters)
        driver.findElement(By.name("Name")).sendKeys("Reena Lather");
        driver.findElement(By.name("Email")).sendKeys("abc@gmail.com");
        driver.findElement(By.name("Contact")).sendKeys("New Zealand");
        //driver.findElements(By.className("list-icon"));
        //driver.findElement((By.name("Country")).notify("NewZealand");

        //linktext
            
        driver.findElement(By.id("navbarScrollingDropdown")).click();
        driver.findElement(By.linkText("Workplace Flexibility The Future of Work is Flexible")).click();
        driver.findElement(By.partialLinkText("Workplace Flexibility")).click();




        //driver.quit();

        //edgebrowser();
    }

    public static void edgebrowser()
    {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Bhara\\edgedriver_win64\\msedgedriver.exe") ;
        //Launch the browser - by creating an object of webdriver interface
        WebDriver driver = new EdgeDriver();// webDriver is interface which implementing in chromedriver class.
        driver.get("https://www.ms.com");//open the url
        // driver.findElement(By.tagName("input"));//driver is object, find element-method, parameters)
        // driver.quit();
    }


}
