package 线程.example.安全;

/**
 * 例子：创建三个窗口卖票，总票数为100张（使用集成Thread类的方法）
 *
 * 说明:在继承Thread类创建多线程的方式中，慎用this 充当同步监视器，考虑时应当前类
 */
class Window extends Thread{
    private static int ticket = 100;

    private static Object obj = new Object();

    @Override
    public void run() {
        while (true){
            //正确的
//            synchronized(obj) {
            synchronized(Window.class) {//Class clazz = Window.class
                //错误的方式：this代表着三个对象
           //synchronized(this) {
                if (ticket > 0) {
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName() + ": 卖票，票号为" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}

public class windowsTest {
    public static void main(String[] args) {
        Window window1 = new Window();
        Window window2 = new Window();
        Window window3 = new Window();

        window1.setName("窗口1");
        window2.setName("窗口2");
        window3.setName("窗口3");

        window1.start();
        window2.start();
        window3.start();

    }
}
