package ClassPackage;

public class packageclass {
    public static void main(String[] args) {
        Integer i = new Integer(4);   //过时的方法
        Integer j = Integer.valueOf(4);
        Integer x = 4;    //自动包装
        int y = x.intValue();    //拆箱
        j = j + 5;   //先自动拆箱再自动装箱

        String s = y + "hello";
        System.out.println(s);
//      y = Integer.parseInt(s);   //4hello报异常NumberFormatException
        String str = "5";
        y = Integer.parseInt(str);
        System.out.println(y);

    }
}
