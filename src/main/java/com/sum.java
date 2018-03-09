package com;
import org.apache.xpath.operations.String;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sum {
    public static void main(String[] args) throws InterruptedException {
        int a,b,t,i;
        int sum;
        a=2;
        b=1;
        sum=0;
       for(i=1;i<=2;i++){
        sum=sum+a/b;
         t=a;
         a=a-b;
         b=a;
}
        System.out.println("和值是:"+sum);

    }










}
