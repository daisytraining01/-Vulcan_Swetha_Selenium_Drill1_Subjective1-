package com.selenium.pkg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class findLink {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://toolsqa.com/");
java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
         System.out.println(links.size());
         
         for (int i = 1; i<=links.size(); i=i+1)
         
         {
         
         System.out.println(links.get(i).getText());
         
         }
         
         }
         
        

 

    }