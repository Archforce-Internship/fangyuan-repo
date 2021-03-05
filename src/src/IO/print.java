package IO;

import java.io.FileNotFoundException;
import java.io.PrintStream;

//打印流
public class print {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("print.txt");
        ps.write(97);      //write写的对应字符
        ps.println(1);      //println不接收类型；
        ps.println('h');
        ps.println("hahaha");
        ps.println(true);
        ps.println("你好");
        System.out.println("输出到控制台");
        System.setOut(ps);     //改变输出位置
        System.out.println("输出到输出流绑定的文件");
    }
}
