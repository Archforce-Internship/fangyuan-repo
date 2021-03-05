package thread;

public class ThreadTest {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        MyRunnable myRunnable = new MyRunnable();
        Thread t = new Thread(myRunnable);
        t.start();
        mt.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("main:"+i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName());  //获取线程名并打印
    }
}
