package language;

//final修饰类则该类无法被继承
public final class Final extends Demo{
    final int a = 1000;
    int c = 100;
    private String name;

    public Final(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void hello() {
        final int b = 10000;
//        b = 10;     //final修饰局部变量无法更改其值
        System.out.println(b);
        super.hello();
    }
//    public void hi(){}    //无法重写父类的final方法；

}
