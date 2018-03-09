package com;
import static org.junit.Assert.fail;
//import org.apache.xpath.operations.String;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class demo {
    public static void main(String[] args) {
        String str = "第二行第1列";
        String str1 = "第三行第6列";
        WebDriver driver = new FirefoxDriver();
        System.setProperty("webdriver.gecko.driver", "D:\\usr\\bin\\geckodriver.exe");
        String url = "C:\\Users\\Administrator\\Desktop\\新建文件夹 (2)\\Selenium_Day_1_下午\\新建文本文档.html";
        driver.get(url);
//定位table元素并把这个元素赋值给一个变量，类似别名，写起来短比较方便而已
        WebElement Table = driver.findElement(By.tagName("table"));
//通过得到的元素变量Table再定位他下面的tr、th、td，得到一组用findElements，多个s,并把一组元素保存在rows里
        List<WebElement> rows = Table.findElements(By.tagName("tr"));
//循环上面的List数组，并把循环结果保存在row里，再通过row得到td的一组元素
        for (WebElement row : rows) {
            List<WebElement> tds = row.findElements(By.tagName("td"));
//通过多重循环得到所有tr和td的元素，并保存在value这个对象里，然后判断，想要的东西和循环出来的一样就打印出来
            for (WebElement td : tds) {
                String value = td.getText();
                if (value.equals(str) || value.equals(str1)) {
                    System.out.print(value + "\n");
                } else {
                    System.out.print("error" + "\n");
                }
            }
        }
    }
}
