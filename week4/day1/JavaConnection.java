package week4.day1;

public class JavaConnection implements DatabaseConnection {

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
    public static void main(String[] args) {
        JavaConnection jc=new JavaConnection();
        jc.connect();
        jc.disconnect();
        jc.executeUpdate();
    }

}
