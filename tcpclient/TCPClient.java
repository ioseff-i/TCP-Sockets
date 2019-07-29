package tcp.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket; //Java-da Socketləri işə salmaq üçün  java.net package-i import edilməlidir
import java.util.Scanner;


public class TCPClient {

    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Socket mySocket = new Socket("localhost",1111);  // localhost - adresin öz kompüterim olduğunu göstərir
        DataOutputStream dat = new DataOutputStream(mySocket.getOutputStream());
        Scanner sc = new Scanner(System.in);
        String send = sc.nextLine();
        dat.writeBytes(send);
        mySocket.close();
        
        
        
        
    }
    
}
