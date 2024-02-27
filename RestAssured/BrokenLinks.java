package TestCase.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BrokenLinks {

   /* public static void brokenlink(){

        String homepage = "http://www.zlti.com";
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lathe\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();// webDriver is interface which implementing in chromedriver class.
        driver.get(homepage);//open the url

        String url = "";
        HttpURLConnection huc = null;
        int repCode = 200;

        List<WebElement> links = driver.findElements(By.tagName("a"));

        Iterator<WebElement> it = links.iterator();

        while(it.hasNext()) {
            url = it.next().getAttribute("href");
            System.out.println(url);

            if (url == null || url.isEmpty()) {

                System.out.println("url is not configured for anchor tag or it is empty");
                continue;
            }
            if (url.startsWith(homepage)) {
                System.out.println("url belongs to another domain, skipping it");
                continue;
            }

            try {
                huc = (HttpURLConnection)(new URL(url).openConnection());

                huc.setRequestMethod("HEAD");

                huc.connect();

                respCode = huc.getResponseCode();

                if(respCode >= 400){
                    System.out.println(url+" is a broken link");
                }
                else{
                    System.out.println(url+" is a valid link");
                }

            } catch (MalformedURLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        driver.quit();

    }*/

    @Test(priority = 1)
    public static void alllinksworking()
    {

        String baseUrl = "http://demo.guru99.com/test/newtours/";
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lathe\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();// webDriver is interface which implementing in chromedriver class.

        String underConsTitle = "Under Construction: Mercury Tours";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.get(baseUrl);
        List<WebElement> linkElements = driver.findElements(By.tagName("a"));
        String[] linkTexts = new String[linkElements.size()];
        int	i = 0;

        //extract the link texts of each link element
        for (WebElement e : linkElements) {
            linkTexts[i] = e.getText();
            i++;
        }

        //test each link
        for (String t : linkTexts) {
            driver.findElement(By.linkText(t)).click();
            if (driver.getTitle().equals(underConsTitle)) {
                System.out.println("\"" + t + "\""
                        + " is under construction.");
            } else {
                System.out.println("\"" + t + "\""
                        + " is working.");
            }
            driver.navigate().back();
        }
        driver.quit();
    }
}
