package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {
    public static void main(String[] args) {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("guest");
        ChromeDriver driver=new ChromeDriver(options);
        driver.get("http://leaftaps.com/opentaps/");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.partialLinkText("CRM")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kanimozhi");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("A");
        driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Tester");
        driver.findElement(By.name("submitButton")).click();
       String actualTitle= driver.findElement(By.id("viewLead_generalProfTitle_sp")).getText();
        String expectedTitle="Tester";
       if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verified successfully");

        }else{
            System.out.println("Title mismatch");
        }
        driver.close();

    }

}
