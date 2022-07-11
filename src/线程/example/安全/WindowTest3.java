package 线程.example.安全;

/**
 *  使用同步方法解决实现Runnable接口的线程安全问题
 *      关于同步方法的总结:
 *          1.同步方法仍然涉及到同步监视器，只是不需要我们显式的声明。
 *          2.非静态的同步方法，同步监视器是: this
 *              静态的同步方法，同步监视器是:当前类本身
 */
class Window3 extends Thread{
    private static int ticket = 100;

    @Override
    public void run() {
        while (true){
            show();
        }
    }
    private static synchronized void show(){//同步监视器：Window3.class
//    public synchronized void show(){//同步监视器 ：w1,w2,w3
        if(ticket > 0){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ": 卖票，票号为" + ticket);
            ticket--;
        }
    }
}

public class WindowTest3 {
    public static void main(String[] args) {
        Window3 window1 = new Window3();
        Window3 window2 = new Window3();
        Window3 window3 = new Window3();

        window1.setName("窗口1");
        window2.setName("窗口2");
        window3.setName("窗口3");

        window1.start();
        window2.start();
        window3.start();

    }
}
