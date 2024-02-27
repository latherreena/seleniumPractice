package TestCase.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ListOfElement {

    public static void listofElements()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lathe\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/test/ajax.html");
        List<WebElement> elements = driver.findElements(By.name("name"));
        System.out.println(elements.size());

        //get the values of above name using for loop
        for (int i = 0; i< elements.size(); i++)
        {
            System.out.println(elements.get(i).getAttribute("value"));
        }

    }

}
