import java.net.*;
import java.io.*;


public class Server {
   
    public static void init(){
        try {
            ServerSocket socket = new ServerSocket(3000);
            
            while (true) {
                Socket insSocket = socket.accept();
                BufferedReader in = new BufferedReader(new InputStreamReader(insSocket.getInputStream()));
                PrintWriter out = new PrintWriter(insSocket.getOutputStream(), true);
                String clientMsg = in.readLine();
                System.out.println(clientMsg);
                String instString = "Hello from server";
                out.println(instString);
                in.close();
                out.close();
                insSocket.close();
                
            }
        } 
        catch (Exception e) {
            System.out.println(e);
        }

    }



    public static void main(String[] args) {
        init();

    }
}
