package oop;

public interface InterFace {
    //下面四个全是抽象方法
    public abstract void method1();
    abstract void method2();
    public void method3();
    void method4();

    //下面是接口的默认方法
    public default void method_default(){
        System.out.println("这是接口的默认方法");
    }
}
