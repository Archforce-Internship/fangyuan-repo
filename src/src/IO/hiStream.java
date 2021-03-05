package IO;

import java.io.*;

//Java IO的Reader和Writer基于字符流
public class hiStream {
    public static void main(String[] args) throws IOException {

        Writer writer = new FileWriter("test.txt",true);
        char [] chars = {'巨','大','中','华'};
        writer.write("Hello World Writer");
        writer.write(chars);
        writer.write(chars,1,2);
        writer.close();

        Reader reader = new FileReader("test.txt");
        int data = 0;
        char [] chars1 = new char[10];
        while((data = reader.read(chars1))!= -1){
            System.out.println(new String(chars1));
        }
        reader.close();

    }
}
