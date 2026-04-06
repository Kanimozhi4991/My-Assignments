package week2.day1;

public class Browser {
public String launchBrowser(String browserName){
    System.out.println("Browser launched successfully");
    return browserName;
}
public void loadUrl(){
    System.out.println("Application Url loaded successfully");
}
public static void main(String[] args) {
    Browser bro=new Browser();
    String Browser = bro.launchBrowser("Internet Explorer");
    System.out.println("browserName:"+Browser);
    bro.loadUrl();
}
}