package week1.day2;

public class FibonacciSeries {
public static void main(String[] args) {
    int n=8;
    int a=0,b=1;
    System.out.println("Fibonacci series:"+"\n"+a+"\n"+b);
 for(int i=2; i<n; i++){
    int c=a+b;
    System.out.println(c);
     a=b;
    b=c;
 }   
   
}
}
