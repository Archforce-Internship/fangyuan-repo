package IO;

import java.io.*;

public class helloStream {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        InputStream is = new FileInputStream(file);
        OutputStream os = new FileOutputStream(file);

        byte write[] = {'x','s','w','l'};
        for(int i=0;i<4;i++){
           os.write(write[i]);
        }
        os.close();
        int size = is.available();
        for(int i=0;i<size;i++)
        {
            System.out.println((char)is.read());
        }
        is.close();
    }
}
