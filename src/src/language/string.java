package language;

public class string {
    public static void main(String[] args) {
        String str = new String();
        char [] str1 = {12345,'A','B','C'};
        char a;

        String s = new String(str1);
        byte [] str2 = {'8','b','c'};
        String s1 = new String(str2);
        System.out.println(str);
        System.out.println(s);
        System.out.println(s1);

//      compare();
        get();
        replace();

    }


    public static void compare(){
        String a="abc";
        String b="abc";
        char [] c = {'a','b','c'};
        String d=new String(c);
        System.out.println(a==b);
        System.out.println(a==d);
        System.out.println(a.equals(d));
        Integer i=new Integer(1);
        Integer j=1;
        System.out.println(i==j);
        System.out.println("abc".equals(d));
        System.out.println("abc".equals(a));
        System.out.println("abc".equalsIgnoreCase("ABC"));
    }

    public static void get(){
        String s = "Hello";
        String str = "World";
        String S = s.concat(str);
        System.out.println(S);
        System.out.println(s+str);
        System.out.println(S.charAt(4));
        System.out.println(S.indexOf("lo"));
        System.out.println(S.substring(2,6));

    }

    public static void replace(){
        String s = "How do you do";

        //替换指定字符
        String s1 = s.replace("o","8");
        System.out.println(s1);

        //按指定符号分割
        String [] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
