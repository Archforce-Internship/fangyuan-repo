package IO;

import java.io.*;

//转换流
public class change {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("GBK.txt"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("change.txt"),"GBK");
        int len = 0;

        //将UTF-8格式的文件GBK.txt转换为GBK格式写入change.txt
        while((len = isr.read()) != -1)
        {
            osw.write(len);
        }
        osw.close();
        isr.close();
    }
}
