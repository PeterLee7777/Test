package 线程.example;

/**
 *  多线程的创建，方式一: 继承于Thread类
 *      1.创建一个继承于Thread类的子类
 *      2.重写Thread类的run()
 *      3.创建Thread类的子类的对象
 *      4.通过此对象调用start()
 *
 * 例子:遍历100以内的所有的偶数
 */

//1.创建一个继承于Thread类的子类
class MyThread extends Thread{
    //2.重写thread类的run()

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
//                System.out.println(i);
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        //3.创建Thread类的子类的对象
        MyThread myThread = new MyThread();

        //4.通过此对象调用start():①启动当前线程 ②调用当前线程的run()
        //  通过对象调用run(),只是调用当前线程的run方法，不能启动线程
        myThread.start();

        //再启动一个线程，遍历100以内的偶数，不可以还让已有的start()线程去执行。
//        myThread.start();

        //我们需要重新创建一个线程对象
        MyThread myThread1 = new MyThread();
        myThread1.start();

        //如下操作仍然是在main线程中执行的
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i + "------------");
            }
        }
    }
}
