package thread;

public class Repository {      //仓库
        private int capacity;  //仓库容量
        private int stock;     //库存

    public Repository(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void Product(int size) throws InterruptedException {
        while (size > 0) {
            if (stock >= capacity)
                wait();
            int real = (capacity - stock) >= size ? size : capacity - stock;
            System.out.println("本次实际生产：" + real);

            size = size - real;
            stock = stock + real;
            System.out.println("还有" + size + "待生产"+"   "+"当前库存为:"+stock);
            notifyAll();
        }
    }

    public synchronized  void Consumer(int size) throws InterruptedException {
        while(size > 0){
            if(stock <= 0)
                wait();
            int real = stock > size ? size : stock;
            System.out.println("本次实际消费:"+real);

            size = size - real;
            stock = stock - real;
            System.out.println("还需要消费:"+size+"   "+"库存为："+stock);
            notify();
        }
    }
}
