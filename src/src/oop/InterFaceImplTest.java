package oop;

public class InterFaceImplTest {
    public static void main(String[] args) {
        InterFaceImpl test = new InterFaceImpl();
        InterFaceImpl2 test1 = new InterFaceImpl2();

        test.method();
        test.method1();
        test.method2();
        test.method3();
        test.method4();
        test.method_default();      //访问接口的默认方法
//      test.method_static();    无法通过实现类的对象访问接口的静态方法
        InterFace1.method_static();     //that's right;
        InterFace1.x();
        InterFace1.y();
//      InterFace1.z();     //私有静态方法无法访问

        test1.method3();
        test1.method4();
        test1.method_default();    //访问重写的接口的默认方法


    }

}
