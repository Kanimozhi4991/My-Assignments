package week4.day1;

public class APIClient {
    public void sendRequest(String endpoint){
        System.out.println("Sending request to endpoint:"+endpoint);
    }
    public void sendRequest(String endpoint,String requestBody,boolean requestStatus){
       System.out.println("Sending request to endpoint:"+endpoint);
        System.out.println("Request body:"+requestBody);
        if(requestStatus){
            System.out.println("Request executed successfully");
           
        }else{
             System.out.println("Request failed");
        }
        
    }
    public static void main(String[] args) {
        APIClient api=new APIClient();
       api.sendRequest("Login");
       api.sendRequest("Login", "{username:'admin',password:1234'}", true);
    }
}

