package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdown {
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
   // click Leads
   driver.findElement(By.linkText("Leads")).click();
   //click Create Lead
   driver.findElement(By.linkText("Create Lead")).click();
   // Enter Company Name
   driver.findElement(By.id("createLeadForm_companyName")).sendKeys("AKM pvt ltd");
   // Enter First name
   driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kanimozhi");
   // Enter Last name
   driver.findElement(By.id("createLeadForm_lastName")).sendKeys("A");
   // Locate sourceDD
   WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
   //Instantiate the select class
   Select sel=new Select(sourceDD);
   sel.selectByValue("LEAD_EMPLOYEE");
   //Locate industryDD
   WebElement industryDD = driver.findElement(By.id("createLeadForm_industryEnumId"));
   //Instantiate the select class
   Select sel1=new Select(industryDD);
   sel1.selectByVisibleText("Computer Software");
   //Locate marketing campaign 
   WebElement mcDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
   //Instantiate the select class
   Select sel2=new Select(mcDD);
   sel2.selectByIndex(3);
   //click submit button
   driver.findElement(By.name("submitButton")).click();
}


}

