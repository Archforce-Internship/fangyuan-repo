package IO;

import java.awt.*;
import java.io.*;

public class Copy {     //利用java输入输出流复制文本
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("C:\\Users\\18387\\Desktop\\hello.txt");
        OutputStream os = new FileOutputStream("C:\\Users\\18387\\Desktop\\fangyuan-repo\\hello.txt");

        byte [] bytes = new byte[1024];      //利用字节数组提高复制效率
        int len = 0;
        while((len = is.read(bytes)) != -1){
            os.write(bytes,0,len);
        }

        os.close();
        is.close();
    }
}
