package 线程.exercise;

/**
 *  例子：创建三个窗口卖票，总票数为100张（使用实现Runnable接口的方法）
 *      存在线程安全问题，待解决
 */

class Window1 implements Runnable{
    private int ticket = 100;
    @Override
    public void run() {
        while (true){
            if(ticket > 0){
                System.out.println(Thread.currentThread().getName() + ": 卖票，票号为" + ticket);
                ticket--;
            }else {
                break;
            }
        }
    }
}
public class WindowTest1 {
    public static void main(String[] args) {
        Window1 window1 = new Window1();
        Thread thread1 = new Thread(window1);
        Thread thread2 = new Thread(window1);
        Thread thread3 = new Thread(window1);
        thread1.setName("窗口一");
        thread2.setName("窗口二");
        thread3.setName("窗口三");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
