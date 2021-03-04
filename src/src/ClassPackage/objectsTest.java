package ClassPackage;

import java.util.Objects;

public class objectsTest {
    public static void main(String[] args) {
        Person person1 = new Person(21,"亚瑟");
        Person person2 = new Person(22,"安琪拉");
        Person person3 = new Person(23,"小桥");
        Person person4 = new Person(23,"小桥");

        System.out.println(person1);  //打印的是我的年龄：21;我的名字：亚瑟，没重写的话打印的是地址值
        System.out.println(person1.equals(person2));
        person1 = person2;
        System.out.println(person2.equals(person1));   //比较的是地址值
        System.out.println(person2.equals(person3));
        System.out.println(person4.equals(person3));

        String s = null;
        String str = "hi";
//        System.out.println(s.equals(str));      //会抛出空指针异常
        System.out.println(Objects.equals(s,str)); ;           //安全用法

    }
}
