package thread;

import java.util.concurrent.locks.Lock;

public class Product {     //生产者
        Repository repository ;

    public Product(Repository repository) {
        this.repository = repository;
    }
     public void product(final int count){

        new Thread(){
            @Override
            public void run() {
                try {
                    repository.Product(count);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();

    }
}
