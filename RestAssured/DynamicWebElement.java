package TestCase.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;

public class DynamicWebElement {

    public static void Dynamic() {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\lathe\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();// webDriver is interface which implementing in chromedriver class.
    driver.get("https://demo.guru99.com/test/web-table-element.php");//open the url


        driver.get("https://demo.guru99.com/test/web-table-element.php");
        //No.of Columns
        List<WebElement> col = driver.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
        System.out.println("No of cols are : " + col.size());
        //No.of rows
        List<WebElement> rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
        System.out.println("No of rows are : " + rows.size());
        driver.close();
    }

    public static void FetchCellValue() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lathe\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();// webDriver is interface which implementing in chromedriver class.
        driver.get("https://demo.guru99.com/test/web-table-element.php");//open the url
        WebElement tbvalue = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
        String tb = tbvalue.getText();
        System.out.println(tb);

        WebElement cellneed = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
        String valueneed = cellneed.getText();
        System.out.println(valueneed);
    }

     static WebDriver wd;
    public static void maxValueDynamicTable() throws ParseException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lathe\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        wd = new ChromeDriver();// webDriver is interface which implementing in chromedriver class.
        wd.get("https://demo.guru99.com/test/web-table-element.php");//open the url

        //no of columns
       // List<WebElement> colmn = wd.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
       // System.out.println(colmn.size());

        //no of rows
     //   List<WebElement> rws = wd.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
      //  System.out.println(rws.size());
        String max = wd.findElement(By.xpath("html/body/div[1]/div[5]/table/tbody/tr[\" + (i+1)+ \"]/td[4]")).getText();

        NumberFormat f = NumberFormat.getNumberInstance();
        Number num = f.parse(max);
        max = num.toString();
        double m = 0, r = 0;
        m = Double.parseDouble(max);
        if (m > r) {
            r = m;

        }
        System.out.println(r);
    }



    }

