package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.List;

public class Pet {

 public static void main(String args[])
 {
     String str = "Florida";
     //System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANJALI\\Drivers\\chromedriver.exe");
     WebDriver driver = new FirefoxDriver();
     driver.get("https://petdiseasealerts.org/forecast-map");
     WebElement frame =driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]"));
     driver.switchTo().frame(frame);
     ////*[name()='svg' and @id='map-svg']//*[local-name()='g' and @id='regions']//*[local-name()='path']

     List<WebElement> list=driver.findElements(By.xpath("//*[name()='svg' and @id='map-svg']//*[local-name()='g' and @id='regions']//*[local-name()='path']"));
        // int counter = 0;
       for(WebElement w : list)
       {
          // counter++;
           //System.out.println(w.getAttribute("name"));
         if( w.getAttribute("name").equals(str))
         {
             w.click();
         }
       }
       //System.out.println(counter);
}}
