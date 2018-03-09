package com;
import static org.junit.Assert.fail;
//import org.apache.tomcat.jni.Thread;
//import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;

public class SeDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "D:\\usr\\bin\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        int a,b,t,i;

        driver.get("http://www.qq.com/");
        
        //driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        Thread.sleep(3000);
        driver.findElement(By.id("sougouTxt")).sendKeys("abc");
        driver.findElement(By.xpath("//*[@id=\"searchBtn\"]")).click();
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Thread.sleep(3000);
        SeDemo SwitchTo = new SeDemo();
        SwitchTo.getCurrentWindowByTitle(driver,"abc - 搜狗搜索");
        //Thread.sleep(3000);

        /*driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        boolean flag = false;
        Thread.sleep(3000);
        for(String s : driver.getWindowHandles()){
            driver.switchTo().window(s);
            if(driver.getTitle().equals("abc - 搜狗搜索")){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("切换窗口成功,当前页面:");

        }else{

            System.out.println("切换窗口失败,当前页面:");

        }*/
        Thread.sleep(3000);
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"loginBtn\"]")).click();
        //Thread.sleep(9000);
        Thread.sleep(3000);
        //driver.get("javascript:void(0);");
        //String title=driver.getTitle();
        //System.out.println("标题是:"+title);
        //Thread.sleep(6000);
        //SwitchTo.getCurrentWindowByTitle(driver,title);
        //driver.switchTo().frame("ptlogin_iframe");
        //driver.findElement(By.id("switcher_plogin")).click();
        //driver.switchTo().frame("ptlogin_iframe").findElement(By.xpath("//*[@id=\"switcher_plogin\"]")).click();
        //driver.findElement(By.xpath("//*[@id=\"switcher_plogin\"]")).click();
        //driver = driver.findElement(By.id("ptlogin_iframe"));
        //WebElement iframe = driver.findElement(By.id("ptlogin_iframe"));
        //driver.switchTo().frame("id");
        Set handles = driver.getWindowHandles();
        System.out.println("所有窗口的语柄是:"+handles);
        driver.switchTo().frame(0);
        driver.switchTo().frame("ptlogin_iframe");
        driver.findElement(By.id("switcher_plogin")).click();
        //driver.findElement(By.xpath("//*[@id=\"switcher_plogin\"]")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//*[@id=\"u\"]")).sendKeys("952340245");
        driver.findElement(By.xpath("//*[@id=\"p\"]")).sendKeys("lineage");
        driver.findElement(By.xpath("//*[@id=\"login_button\"]")).click();
    }
    public boolean getCurrentWindowByTitle(WebDriver driver, String title){

        boolean flag = false;
        for(String s : driver.getWindowHandles()){
            driver.switchTo().window(s);
            if(driver.getTitle().equals(title)){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("切换窗口成功,当前页面:");

        }else{

            System.out.println("切换窗口失败,当前页面:");

        }
        return flag;
    }

}

