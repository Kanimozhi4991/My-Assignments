package week4.day1;

public class LoginPage extends BasePage{
    @Override
   public void performCommonTasks(){
    System.out.println("Performing Login page specific tasks");
    findElement("username field");
    enterText("kanimozhi", "username field");
    findElement("password field");
    enterText("kani@123", "password field");
    clickElement("login button");
}

public static void main(String[] args) {
    BasePage bp=new BasePage();
    bp.performCommonTasks();
    System.out.println("----------------");
    LoginPage lp=new LoginPage();
    lp.performCommonTasks();
  
    
}
}
