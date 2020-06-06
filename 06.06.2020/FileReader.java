import java.io.FileInputStream;

public class FileReader {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("C:/java/newfile.txt");
            int i;
            while ((i=fin.read()) != -1){
                System.out.print((char)i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
