package thread;

class MyRunnable implements Runnable{     //实现Runnable接口
    int j=20;
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+",j="+this.j--);
        }
    }

}
