package week4.day1;

public class BasePage {
public void findElement(String locator){
    System.out.println("Finding element using locator:"+locator);
}
public void clickElement(String locator){
    System.out.println("Clicking on element:"+locator);
}
public void enterText(String text,String locator){
    System.out.println("Entering text: "+text+" "+"into: "+locator);
}
public void performCommonTasks(){
    System.out.println("Performing common tasks from basepage");
}
}
