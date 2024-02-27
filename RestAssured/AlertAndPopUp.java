package TestCase.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.Set;

public class AlertAndPopUp {

    public static void alert() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Bhara\\edgedriver_win64\\msedgedriver.exe") ;
        //Launch the browser - by creating an object of webdriver interface
        WebDriver driver = new ChromeDriver();// webDriver is interface which implementing in chromedriver class.
        driver.get("https://demo.guru99.com/test/delete_customer.php");//open the url

        //alert message:
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("234234");
        driver.findElement(By.name("submit")).click();
       String alert =  driver.switchTo().alert().getText();
        System.out.println(alert);

       // Thread.sleep(5000);
        driver.switchTo().alert().accept();


    }

    public static void popUP()  {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Bhara\\edgedriver_win64\\msedgedriver.exe");
        //Launch the browser - by creating an object of webdriver interface
        WebDriver driver = new ChromeDriver();// webDriver is interface which implementing in chromedriver class.
        driver.get("https://demo.guru99.com/popup.php");//open the url

        driver.findElement(By.xpath("//*[contains(@href, 'popup.php')]")).click();

        //handle new window
        String MainWindow = driver.getWindowHandle();

        //to handle all new open windows
        Set<String> sl = driver.getWindowHandles();
        Iterator<String> i1 = sl.iterator();

        while(i1.hasNext())
        {
            String ChildWindow=i1.next();

            if(!MainWindow.equalsIgnoreCase(ChildWindow))
            {

                // Switching to Child window
                driver.switchTo().window(ChildWindow);
                driver.findElement(By.name("emailid")).sendKeys("avc.3n@gmail.com");

                driver.findElement(By.name("btnLogin")).click();

                // Closing the Child Window.
                driver.close();
            }
        }
        // Switching to Parent window i.e Main Window.
        driver.switchTo().window(MainWindow);


    }
}
