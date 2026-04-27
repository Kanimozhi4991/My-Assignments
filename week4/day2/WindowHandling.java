package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandling {
    public static void main(String[] args) {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("guest");
        ChromeDriver driver=new ChromeDriver(options);
        driver.get("http://leaftaps.com/opentaps/control/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.id("username")).sendKeys("democsr2");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.partialLinkText("SFA")).click();
        driver.findElement(By.xpath("//a[text()='Contacts']")).click();
        driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
        String mainWindow = driver.getWindowHandle();
        System.out.println(mainWindow);
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//input[@id='partyIdFrom']/following-sibling::a")).click();
        Set<String> childWindow1 = driver.getWindowHandles();
        List<String>list=new ArrayList<String>(childWindow1);
        driver.switchTo().window(list.get(1));
        driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
        
        driver.switchTo().window(mainWindow);
        driver.findElement(By.xpath("//input[@id='partyIdTo']/following-sibling::a")).click();
        Set<String> childWindow2 = driver.getWindowHandles();
        List<String>list1=new ArrayList<String>(childWindow2);
        driver.switchTo().window(list1.get(1));
        driver.findElement(By.xpath("(//a[@class='linktext'])[5]")).click();
        driver.switchTo().window(mainWindow);
        driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
        driver.switchTo().alert().accept();
        String title = driver.getTitle();
        System.out.println("Page Title:"+title);
        if(title.contains("View Contact")){
            System.out.println("Merge successful");
        }else{
            System.out.println("Merge failed");
        }
       driver.quit();
    }

}
