package thread;

public class CPRTest {
    public static void main(String[] args) {    //测试
        Repository repository = new Repository(150);
        Product pro = new Product(repository);
        Consumer con = new Consumer(repository);
        pro.product(99);
        con.consumer(100);
        pro.product(71);
        con.consumer(60);
    }
}
