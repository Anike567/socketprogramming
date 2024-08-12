package webserver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class server {

    public static void init(){
        try {
            ServerSocket socket = new ServerSocket(3000);
            
            while (true) {
                Socket insSocket = socket.accept();
                BufferedReader in = new BufferedReader(new InputStreamReader(insSocket.getInputStream()));
                PrintWriter out = new PrintWriter(insSocket.getOutputStream(), true);
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    if (inputLine.isEmpty()) {
                        // End of headers
                        break;
                    }
                    System.out.println(inputLine);
                }
                String httpResponse = "HTTP/1.1 200 OK\r\n\r\nHello from server";
                out.println(httpResponse);
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
