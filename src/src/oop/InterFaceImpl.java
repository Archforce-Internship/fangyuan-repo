package oop;

//该类实现多个接口
public class InterFaceImpl implements InterFace,InterFace1 {
    @Override
    public void method() {
        System.out.println("重写来自InterFace1的方法"+num);
    }

    @Override
    public void method1() {
        System.out.println("重写第一个方法");
    }

    @Override
    public void method2() {
        System.out.println("重写第二个方法");
    }

    @Override
    public void method3() {
        System.out.println("重写第三个方法");
    }

    @Override
    public void method4() {
        System.out.println("重写第四个方法");
    }
}
