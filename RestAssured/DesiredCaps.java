package TestCase.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import  org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCaps {

       public static void dsrdcapblts() {

        System.setProperty("webdriver.edge.driver", "C:\\Users\\IEDriverServer_x64_4.14.0");
        WebDriver driver = new InternetExplorerDriver();
        driver.get("http://google.com");

    }



}
