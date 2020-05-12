package com.selenium.pkg;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;
public class Question1 
{
 public static void main(String[] args) throws InterruptedException {
        
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();// Launching the browser
        driver.manage().window().maximize();// Maximize the window
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/newtours/register.php");
        // to select Australia from List box
        Select country = new Select(driver.findElement(By.name("country")));
        country.selectByVisibleText("AUSTRALIA");
        List <WebElement> list = country.getOptions();
        for(int i=0; i<list.size(); i++)        
            {
                	System.out.println(list.get(i).getText());
            }
      //to print all the country dropdown
        Thread.sleep(2000);
        Select country1 = new Select(driver.findElement(By.name("country")));
        
        List<WebElement> list1 = country1.getOptions();
        for(int i=0; i<list1.size(); i++)        
            {
                System.out.println(list1.get(i).getText());
            }
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Swetha");
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Priyadharshini ");
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9940648904");
        driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("krishnack1994@gmail.com");
        driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("1-94582");
        driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Chennai");
        driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Tamilnadu");
        driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("600125");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Swetha124");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Maveric@2020");
        driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Maveric@2020");
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//font[@face='Arial, Helvetica, sans-serif']/a")).click();
        
        driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Swetha124");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Maveric@2021");
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        String Title=driver.getTitle();
        System.out.println(Title);
        
        if(Title.equals("Login: Mercury Tours")) {
            
            Screenshot(driver,"C:\\Users\\DELL\\Desktop\\New folder\\LoginPass.png");
            
        }else {
            
            Screenshot(driver,"C:\\Users\\DELL\\Desktop\\New folder\\LoginFail.png");
        }
        
                    
        }
    public static void Screenshot(WebDriver driver,String path) {
        
        TakesScreenshot scrShot =((TakesScreenshot)driver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File(path);
        //Copy file at destination
        try {
            Files.copy(SrcFile, DestFile);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

 


}
