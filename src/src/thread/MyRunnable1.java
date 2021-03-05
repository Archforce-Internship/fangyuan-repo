package thread;

public class MyRunnable1 implements Runnable{
    static int j=10000;
//    @Override
//    public void run() {
//        for (int i = 0; i < 5000; i++) {
//            System.out.println(j--);
//        }
//    }

    @Override
    public synchronized void run() {      //带锁
        for (int i = 0; i < 5000; i++) {
            System.out.println(j--);
        }
    }
}
