package IO;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class propertie {
    public static void main(String[] args) throws IOException {
        show1();
        show2();
    }

    private static void show2() throws IOException {
        Properties pro = new Properties();
        pro.load(new FileReader("Test.txt"));
        Set<String> set= pro.stringPropertyNames();
        for(String s : set){
            System.out.println(s+":"+pro.getProperty(s));
        }
    }

    private static void show1() throws IOException {
        Properties pro = new Properties();
        pro.setProperty("安琪拉","156");
        pro.setProperty("亚瑟","175");
        pro.setProperty("程咬金","178");
        Set<String> set= pro.stringPropertyNames();
        for(String s : set){
            System.out.println(s+":"+pro.getProperty(s));
        }
        Writer writer = new FileWriter("Test.txt");
        pro.store(writer,"111");
        writer.close();

    }
}
