package thread;

public class Consumer {   //消费者
    Repository repository;

    public Consumer(Repository repository) {
        this.repository = repository;
    }

    public void consumer(final int count){
        new Thread(){
            @Override
            public void run() {
                try {
                    repository.Consumer(count);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
}
