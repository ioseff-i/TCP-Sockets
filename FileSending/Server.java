import java.io.*;
import java.net.*;
public class Server
{
    public static void main(String[] args) throws Exception
    {
        ServerSocket connectionSocket = new ServerSocket(6789);
        while(true)
        {
            Socket mySocket = connectionSocket.accept();
            InputStream in = mySocket.getInputStream();
            OutputStream out = new FileOutputStream("/home/user/Desktop/huhuh.pdf");
            byte[] buffer = new  byte[2000];
            int read = 0;
            while((read=in.read())!=-1)
            {
                out.write(read);
            }
            out.flush();
            out.close();
            System.out.println("Done!");


        }
    }
}
