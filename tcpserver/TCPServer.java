
package tcp.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

   
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        ServerSocket serverSocket = new ServerSocket(1111); //Xüsusən Server Socket üçün etdik Bunu
        while(true) //Yuxarıda qeyd etmişdik ki, Server Daima açıq olmalıdır
        {
            Socket mySocket = serverSocket.accept();
            InputStreamReader isr = new InputStreamReader(mySocket.getInputStream());
            BufferedReader  bw = new BufferedReader(isr);
            String myText = bw.readLine();
            System.out.println("You've read: "+myText);
            
            
        }
    }
    
}
