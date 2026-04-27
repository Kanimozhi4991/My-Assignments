package week4.day1;

public class LearnOverriding extends LearnOverloading {
    @Override
public void reportStep(String verify,String status)// possible to change the input parameters of superclass(LearnOverloading) using Override
{
        System.out.println("Verify:"+verify+"\n"+"Status:"+status);
        
    }public static void main(String[] args) {
        LearnOverriding LO=new LearnOverriding();
        LO.reportStep("username", "pass");
        LO.reportStep("password", "fail", false);
        
    }
}
