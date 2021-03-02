package entity;

public class Counter{
    private int value=0;
    public synchronized int getNext(){
        return value++;
    }

    public int getValue() {
        synchronized (this){
            return value++;
        }
    }

    public static void main(String[] args) {
//        Counter A = new Counter();
//        System.out.println("getNext:"+A.getNext());
//        System.out.println("getValue:");
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                }
            }
        }).start();
    }
}