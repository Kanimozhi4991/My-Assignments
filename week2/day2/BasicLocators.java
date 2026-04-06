package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasicLocators {
public static void main(String[] args) {
    //to handle the Browser notifications
    ChromeOptions options=new ChromeOptions();
    options.addArguments("guest");
    ChromeDriver driver= new ChromeDriver(options);
    //Load the url
    driver.get("http://leaftaps.com/opentaps/control/main");
    
    //maximize the screen
    driver.manage().window().maximize();
    
   System.out.println(driver.getTitle());
   //Enter the username
   driver.findElement(By.id("username")).sendKeys("demosalesmanager");
   //Enter the password
   driver.findElement(By.id("password")).sendKeys("crmsfa");
   //click Login
   driver.findElement(By.className("decorativeSubmit")).click();
   //click crmsfa
   driver.findElement(By.partialLinkText("SFA")).click();
   // close the browser
   driver.close();
}
}
