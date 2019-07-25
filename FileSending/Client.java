import java.io.*;
import java.net.*;
import java.util.*;
public class Client {
    public static void main(String[] args) throws Exception
    {
        Socket mySocket = new Socket("localhost",6789);
        DataOutputStream dat = new DataOutputStream(mySocket.getOutputStream());
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        byte[] bytes = readFromFile(path);
        dat.write(bytes);
        dat.close();



    }
    public static byte[] readFromFile(String pathName)
    {
        byte[] bytes = null;
        try(InputStream in = new FileInputStream(pathName))
        {
            File file = new File(pathName);
            bytes = new byte[(int)file.length()];
            in.read(bytes);

        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return bytes;
    }
}
