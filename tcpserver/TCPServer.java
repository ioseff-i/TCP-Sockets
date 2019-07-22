/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcp.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author user
 */
public class TCPServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        ServerSocket serverSocket = new ServerSocket(1111);
        while(true){
            Socket mySocket = serverSocket.accept();
            InputStreamReader isr = new InputStreamReader(mySocket.getInputStream());
            BufferedReader  bw = new BufferedReader(isr);
            String myText = bw.readLine();
            System.out.println("You've read: "+myText);
            
            
        }
    }
    
}
