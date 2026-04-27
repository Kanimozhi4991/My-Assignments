package week4.day1;

public class JavaConnection1 extends MySqlConnection{


@Override
public void connect() {
    System.out.println("connecting to Java Database");
}

@Override
public void disconnect() {
      System.out.println("disconnecting from Java Database");
}

@Override
public void executeUpdate() {
System.out.println("Executing update ...");
}

@Override
public void executeQuery() {
    System.out.println("Executing query...");
}
public static void main(String[] args) {
    


    JavaConnection1 jc1=new JavaConnection1();
    jc1.connect();
    jc1.disconnect();
    jc1.executeUpdate();
    jc1.executeQuery();
    
    
}
}
