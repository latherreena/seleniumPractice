package TestCase.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

    public static void tables() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Bhara\\edgedriver_win64\\msedgedriver.exe");
        //Launch the browser - by creating an object of webdriver interface
        WebDriver driver = new ChromeDriver();// webDriver is interface which implementing in chromedriver class.
       // driver.get("http://demo.guru99.com/test/write-xpath-table.html");//open the url
        //driver.get("http://demo.guru99.com/test/accessing-nested-table.html");
        driver.get("http://demo.guru99.com/test/newtours/");

       // String innertext = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
       // System.out.println(innertext);

        //String NestedTable = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]/table/tbody/tr/td[2]")).getText();
       // System.out.println(NestedTable);

        String attributepradicate = driver.findElement(By.xpath("//table[@width=\"270\"]/tbody/tr[4]/td")).getText();
        System.out.println(attributepradicate);



    }
}
