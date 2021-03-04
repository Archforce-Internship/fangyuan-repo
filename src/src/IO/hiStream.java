package IO;

import java.io.*;

//Java IO的Reader和Writer基于字符流
public class hiStream {
    public static void main(String[] args) throws IOException {

        Writer writer = new FileWriter("test.txt");
        writer.write("Hello World Writer");
        writer.close();

        Reader reader = new FileReader("test.txt");
        int data = reader.read();

        while(data != -1){
            char dataChar = (char) data;
            System.out.println(dataChar);
            data = reader.read();
        }
    }
}
