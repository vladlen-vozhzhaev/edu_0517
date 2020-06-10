import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class MyClinet {
    public static void main(String[] args) {
        Socket socket;
        DataOutputStream out;
        DataInputStream in;
        Scanner scanner;
        try{
            socket = new Socket("localhost",8189);
            in = new DataInputStream(socket.getInputStream());
            out= new DataOutputStream(socket.getOutputStream());
            scanner = new Scanner(System.in);
            while(true){
                String clientText = scanner.nextLine();
                out.writeUTF(clientText);
                String strFromSerer = in.readUTF();
                System.out.println(strFromSerer);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
