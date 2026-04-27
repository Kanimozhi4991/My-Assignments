package week1.day2;

public class EdgeBrowser {
public static void main(String[] args) {
    Browser ak=new Browser();
    String Name=ak.launchBrowser("Microsoft Edge");
System.out.println("browserName:"+Name);
    ak.loadUrl();
}
}
