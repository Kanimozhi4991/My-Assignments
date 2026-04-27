package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListInterface {
    public static void main(String[] args) throws InterruptedException {
ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.ajio.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("bags",Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
        driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
        String countItems = driver.findElement(By.xpath("(//div[@class='length'])[1]")).getText();
        System.out.println(countItems);
        List<WebElement> Brands = driver.findElements(By.xpath("(//div[@class='facet-head-before facet-xpndicon'])[3]"));
        List<String>brandsList=new ArrayList<String>();
        for (WebElement each : Brands) {
            String text = each.getText();
            brandsList.add(text);
            
        }

    }
}