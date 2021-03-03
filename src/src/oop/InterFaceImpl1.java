package oop;

//未全部实现接口的方法故为抽象类
public abstract class InterFaceImpl1 implements InterFace{
    @Override
    public void method1() {
        System.out.println("重写第一个方法");
    }

    @Override
    public void method2() {
        System.out.println("重写第二个方法");
    }
}
