package language;

public class FinalTest {
    public static void main(String[] args) {
        Final fin = new Final("圆圆");
        System.out.println(fin.a);
//        fin.a = 10000;       //final修饰成员变量不可变
        fin.c = 10;
        System.out.println(fin.c);
        fin.hello();
        System.out.println(fin);
        System.out.println(fin.getName());
        fin = new Final("芳芳");
        System.out.println(fin);
        System.out.println(fin.getName());

        final Final fi = new Final("圆圆");
//        fi = new Final("方方");     //final修饰后fi不可更改地址值
        System.out.println(fi.getName());
        fi.setName("方方");
        System.out.println(fi.getName());
    }
}
