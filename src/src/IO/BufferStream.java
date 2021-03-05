package IO;

import java.io.*;

//字节缓冲流
public class BufferStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("buffer.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);   //字节缓冲输出流
        bos.write("我的天空".getBytes());
        bos.close();

        byte [] bytes = new byte[1024];
        FileInputStream fis = new FileInputStream("buffer.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);    //字节缓冲输入流
        bis.read(bytes);
        System.out.println(new String(bytes));
        bis.close();

    }
}
