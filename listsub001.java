import java.io.IOException;
import java.io.*;
class listsubject {
    public static void list () throws IOException {
        int n = 0;
        byte b[] = new byte[128];
        FileInputStream fin = new FileInputStream("subject.txt");
        while ((n = fin.read(b)) != -1) {
          for(int i=0;i<n;i++) {
            System.out.print((char)b[i]);
          }
        }
        fin.close();
    }
}