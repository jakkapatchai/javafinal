import java.io.*;
class addstudent {
    public static void addstd () throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String bufid,bufname;
        System.out.print("Wait id : ");
        bufid = stdin.readLine();
        System.out.print("Wait name : ");
        bufname = stdin.readLine();
        String b;
        String ar[] = new String[10];
        FileReader fin = new FileReader("student.txt");
        BufferedReader bin = new BufferedReader (fin);
        int i = 0;
        while ((b =  bin.readLine()) != null) {      
            ar[i] = b; 
            i = i + 1;
        }    
        fin.close();
        int tot = i;
        FileOutputStream fout = new FileOutputStream("student.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        PrintStream pout = new PrintStream(bout);
        i = 0;
        while (i < tot) {      
            pout.println(ar[i]);     
            i = i + 1;
        }
        pout.println(bufid + "," + bufname);
        System.out.println("Add : completely");
        pout.close();
    }
}