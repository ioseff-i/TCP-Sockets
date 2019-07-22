/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcp.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class TCPClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Socket mySocket = new Socket("localhost",1111);
        DataOutputStream dat = new DataOutputStream(mySocket.getOutputStream());
        Scanner sc = new Scanner(System.in);
        String send = sc.nextLine();
        dat.writeBytes(send);
        mySocket.close();
        
        
        
        
    }
    
}
