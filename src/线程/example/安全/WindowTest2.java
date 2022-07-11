package 线程.example.安全;


class Window2 implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            show();
        }
    }

    public synchronized void show() {//哦同步·同步监视器：this
//        synchronized (this){
            if (ticket > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + ": 卖票，票号为" + ticket);
                ticket--;
            }
//        }
    }

}

public class WindowTest2 {
    public static void main(String[] args) {
        Window2 window2 = new Window2();
        Thread thread1 = new Thread(window2);
        Thread thread2 = new Thread(window2);
        Thread thread3 = new Thread(window2);
        thread1.setName("窗口一");
        thread2.setName("窗口二");
        thread3.setName("窗口三");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

