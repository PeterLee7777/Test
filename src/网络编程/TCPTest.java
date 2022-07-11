package 网络编程;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 实现TCp的网络编程
 * 例子1：客户端发sing信息给服务端
 */
public class TCPTest {

    //客户端
    @Test
    public void client() throws IOException {
        Socket socket = null;
        OutputStream os = null;
        try {
            InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
            socket = new Socket(inetAddress, 8899);

            os = socket.getOutputStream();
            os.write("你好，我是客户端".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }

    }

    //服务端
    @Test
    public void server() throws IOException {

        ServerSocket serverSocket = new ServerSocket(8899);
        Socket socket = serverSocket.accept();

        InputStream is = socket.getInputStream();

        //不建议这样写，可能会有乱码
//        byte[] buffer = new byte[1024];
//        int len;
//        while ((len = is.read(buffer)) != -1) {
//            String str = new String(buffer, 0, len);
//            System.out.print(str);
//        }

    }
}
