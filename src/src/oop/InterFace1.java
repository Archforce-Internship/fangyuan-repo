package oop;

public interface InterFace1 {

    int num = 100;   //默认为public static final
    public abstract void method();

    public static void method_static() {
        System.out.println("这是InterFace1静态方法");
    }

    public static void x() {
        System.out.println("接口的静态方法x");
        z();
    }

    public static void y() {
        System.out.println("接口的静态方法y");
        z();
    }

    private static void z() {
        System.out.println("接口的静态私有方法");
    }
    private void v() {
        System.out.println("接口的私有方法");
    }
}
