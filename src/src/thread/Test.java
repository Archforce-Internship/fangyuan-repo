package thread;

public class Test {
    public static void main(String[] args) {
        Object obj = new Object();

        new Thread(){      //消费者线程
            @Override
            public void run() {
                synchronized (obj){
                    System.out.println("我需要一些商品");
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("好的，这是货款");
                }
            }
        }.start();

        new Thread(){       //生产者线程
            @Override
            public void run() {
                synchronized (obj){
                    try {
                        System.out.println("给我点时间生产");
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    obj.notify();
                    System.out.println("好了，这是你的货");
                }
            }
        }.start();
    }
}

