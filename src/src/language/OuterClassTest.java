package language;

public class OuterClassTest {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.get();
        outerClass.method();

        Outer outer = new Outer() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类实现了方法");
            }
        };
        outer.method();

        Outer out = new Outer() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类实现了方法");
            }
        };
        out.method();
    }
}
