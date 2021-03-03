package oop;

public class InterFaceImpl2 extends InterFaceImpl1{
    @Override
    public void method3() {
        super.method1();
        System.out.println("重写第三个方法");
    }

    @Override
    public void method4() {
        super.method2();
        System.out.println("重写第四个方法");
    }

    @Override
    public void method_default() {
        System.out.println("重写接口的默认方法");
    }
}
