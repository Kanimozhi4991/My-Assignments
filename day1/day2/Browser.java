package week1.day2;

public class Browser {
public  String launchBrowser(String browserName)
{
    System.out.println("Browser launched successfully");
    return browserName;
}
public void loadUrl(){
    System.out.println("Application Url loaded successfully");
}
public static void main(String[] args) {
    Browser bro=new Browser();
    String Name=bro.launchBrowser("Google Chrome");
    System.out.println("Browser Name:"+Name);
    bro.loadUrl();
}
}
