package thread;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(getName());
        for (int i = 0; i < 20; i++) {
            System.out.println("run:"+i);
        }
    }
}
