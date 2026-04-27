package week4.day1;

public class Amazon extends CanaraBank { //concrete class having implemented methods(0% Abstract)

    public void pcashOnDelivery(){
    System.out.println("payment through cash on delivery selected");
}
public void upiPayments(){
    System.out.println("Payment done using UPI");
}
public void cardPayments(){
    System.out.println("Payment done using Credit/Debit card");
}
public void internetBanking(){
    System.out.println("Payment done through internet banking");
}
@Override
public void recordFixedDeposit() {
    System.out.println("Recording the amount of fixed deposit");
}
public static void main(String[] args) {
    Amazon An=new Amazon();
    An.pcashOnDelivery();
    An.cardPayments();
    An.internetBanking();
    An.upiPayments();
    An.recordPaymentDetails();
    An.recordFixedDeposit();
}
}
