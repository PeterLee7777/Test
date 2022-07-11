package 网络编程;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 三、遁信要素一: IP和端口号.
 * 1. IP:唯一的标识Internet.上的计算机 (通信实体)
 * 2.在Java 中使用InetAddress类代表IP
 * 3. IP分类: IPv4和IPv6 ;万维网和局域网
 * 4.域名:
 *      WWw. baidu. com  WWw. mi.com WWw. sina.com Www. jd. com  WWW. vip. com
 * 5.本地回路地址: 127.0.0.1 对应着: Localhost
 *
 * 6. 如何实例化InetAddress:两个方法：getByName（String host）、getByLocalhost（）
 *          两个常用方法: getHostName() / getHostAddress()
 *
 * 7. 端口号：正在计算机上运行的进程
 *      要求:不同的进程有不同的端口号
 *      范围:被规定为一个16位的整数0~65535.
 * 8.端口号与IP地址的组合得出一-个网络套接字: Socket
 *
 */

public class InetAddressTest {

    public static void main(String[] args) {

        try {

            InetAddress inet1 = InetAddress.getByName("192.168.10.11");
            System.out.println(inet1);

            InetAddress inet2 = InetAddress.getByName("www.baidu.com");
            System.out.println(inet2);

            InetAddress inet3 = InetAddress.getByName("127.0.0.1");
            System.out.println(inet3);

            //获取本机ip
            InetAddress inet4 = InetAddress.getLocalHost();
            System.out.println(inet4);

            //getHostName()
            System.out.println(inet2.getHostName());
            //getHostAddress()
            System.out.println(inet2.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
