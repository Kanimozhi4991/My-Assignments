package week4.day1;

public abstract class CanaraBank implements Payment { //abstract class having both implemented unimplemented methods (0-100% Abstract)
public void recordPaymentDetails(){
    System.out.println("Recording details of payment system"); //implemented method
}
public abstract void recordFixedDeposit(); // unimplemented method
}
