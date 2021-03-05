package thread;

public class MyRunnable1Test {
    public static void main(String[] args) {  //线程安全测试；两个线程同时对共享变量j进行访问
        MyRunnable1 myRunnable1 = new MyRunnable1();
        Thread t1 = new Thread(myRunnable1);
        Thread t2 = new Thread(myRunnable1);
        t1.start();
        t2.start();

    }
}
