package IO;

import java.io.*;

public class stream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\18387\\Desktop\\hello.txt");
        FileOutputStream fos1 = new FileOutputStream("C:\\Users\\18387\\Desktop\\hello.txt",true);

        byte [] zi = {14,57,89,26,97};
        fos.write(zi);
        fos.write(99);
        fos1.write("\r\n".getBytes());      //\r\n.getBytes()用来换行，fos1是一个写入不覆盖文件之前内容的对象
        fos1.write(zi,2,2);
        fos.close();

        InputStream is = new FileInputStream("C:\\Users\\18387\\Desktop\\hello.txt");
        byte [] bytes = new byte[2];
//        int size = is.available();
//        for(int i=0;i<size;i++)
//        {
//            System.out.println((char)is.read());   //单字节读取
//        }
//        is.close();
        is.read(bytes);                     //一次读取多字节
        System.out.println(new String(bytes));
        is.close();
    }
}
