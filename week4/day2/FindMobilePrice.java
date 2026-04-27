package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindMobilePrice {
public static void main(String[] args) {
    ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
         driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles",Keys.ENTER);
      
         List<WebElement> mobilePrice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
          List<Integer> priceList=new ArrayList<Integer>();
          for (WebElement eachPrice : mobilePrice) {
            String text = eachPrice.getText();
            String text1 = text.replace(",", "");
            if(!text1.isEmpty()){
                int value = Integer.parseInt(text1);
                priceList.add(value);
            }
                               
          }Collections.sort(priceList);
          System.out.println("Lowest Price is:"+priceList.get(0));
}
}
