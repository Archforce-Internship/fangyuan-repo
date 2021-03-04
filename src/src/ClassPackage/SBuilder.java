package ClassPackage;

//StringBuilder相较于String更节省内存
public class SBuilder {
    public static void main(String[] args) {
        String s = "hello";
        StringBuilder str = new StringBuilder();
        StringBuilder str1 = new StringBuilder(s);

        System.out.println(s);
        System.out.println(str);
        System.out.println(str1);

        //append()方法不接收返回值类型
        str.append(s);
        str.append(1);
        str.append("world");
        str.append(true);
        System.out.println(str);
        System.out.println(str.toString());
    }
}
