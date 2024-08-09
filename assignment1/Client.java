package assignment1;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("127.0.0.1", 3000);
             InputStream in = socket.getInputStream();
             OutputStream out = socket.getOutputStream()) {

            // Sending a string to the server
            String str = "hii from client \n";
            byte[] buffer = str.getBytes();
            out.write(buffer);

            // Reading response from the server
            int ch;
            while ((ch = in.read()) != -1) {
                System.out.print((char) ch);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
