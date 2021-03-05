package IO;

import java.io.*;

//字符缓冲流
public class BufferChar {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("buff.txt");
        BufferedWriter bw = new BufferedWriter(writer);
        for (int i = 0; i < 3 ; i++) {
            bw.write("你好");
            bw.newLine();  //换行
        }
        bw.close();

        Reader reader = new FileReader("buff.txt");
        BufferedReader br = new BufferedReader(reader);
        System.out.println(br.readLine());   //读一行
        br.close();
    }
}
