package language;

public class Demo {

    public final void hi(){
        System.out.println("不能被重写");
    }
    public void hello(){
        System.out.println("我可以");
    }
    public static void main(String[] args) {
        int a=(int)100l;
        System.out.println("a="+a);
    }
}
