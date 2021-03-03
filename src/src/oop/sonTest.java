package oop;

public class sonTest {
    public static void main(String[] args) {
        father baba = new father();
        father laoda = new son1("圆圆",22);
        father laoer = new son2("小方");
        son1 erZi1 = new  son1("江江",21);
        son2 erZi2 = new son2("小芳");

        //father对象
        baba.fa1();
        baba.fa();
        baba.setStatus("爸爸");

       //父类引用绑定子类对象
        laoda.fa();
        laoda.fa1();
        laoda.setStatus("父类引用");
        laoda.getStatus();
        if(laoda instanceof son1){
            System.out.println("laoda是son1对象");  //判断laoda是不是son1对象
        }
//        laoda.getName();   //父类引用绑定子类对象无法访问子类的方法
        son1 son = (son1)laoda;    //向下转型
        son.getName();

        laoer.fa();
        laoer.fa1();
        laoer.getStatus();

        //子类对象
        erZi1.fa();
        erZi1.setSmallName("小江");
        System.out.println(erZi1.getAge());
        System.out.println(erZi1.getName());
        System.out.println(erZi1.getSmallName());

        erZi2.fa1();
        System.out.println(erZi2.name+" "+erZi2.age+" "+erZi2.getSmallName());

    }
}
