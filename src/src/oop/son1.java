package oop;

public class son1 extends father{

    public son1(String s,int a) {
        name=s;
        age=a;
    }

    @Override
    public void fa() {
        super.fa();
        System.out.println("Override father's fa()");
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
            father son = new son1("圆圆",22);
            son1 erzi = new  son1("江江",2);
            son.fa();
        System.out.println(son.age);
        System.out.println(son.name);

       // son.getName();   父类引用绑定子类对象无法访问子类的方法

        System.out.println(erzi.getAge());
        System.out.println(erzi.getName());

        son.fa1();
        erzi.fa1();     //子类访问父类方法
        System.out.println(erzi.maybe);
        System.out.println(son.maybe);
    }
}
