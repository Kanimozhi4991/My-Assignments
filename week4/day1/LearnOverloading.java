package week4.day1;
public class LearnOverloading {
    public void reportStep(String msg,String status){
        System.out.println("Message:"+msg+"\n"+"Status:"+status);
        
    }
    public void reportStep(String msg,String status,boolean snap){
       
        System.out.println("Message:"+msg+"\n"+"Status:"+status);
        if(snap){
            System.out.println("snap is taken");
        }else{
            System.out.println("snap is not taken");
        }
        
    }
    public static void main(String[] args) {
        LearnOverloading lo=new LearnOverloading();
        lo.reportStep("login", "pass");
        lo.reportStep("login", "failed", false);
    }

}
