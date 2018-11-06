package org.hx.ian.netty.transports;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;

/**
 * @ClassName PlainOioServer
 * @Author hx 2018/11/5
 * @Description 未使用 Netty 的阻塞网络编程
 * @Date 2018/11/5 21:47
 * @Version 1.0
 */
public class PlainOioServer {

    private static final Logger LOGGER = LoggerFactory.getLogger(PlainOioServer.class);

    public void serve(int port) throws IOException {

        // 将服务器绑定到指定端口
        final ServerSocket socket = new ServerSocket(port);
        try {
            for (; ; ) {

                // 接受连接
                final Socket clientSocket = socket.accept();
                LOGGER.info("Accepted connection from [{}]", clientSocket);

                // 创建一个新的线程来处理该连接
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            OutputStream out = clientSocket.getOutputStream();
                            // 将消息写给已连接的客户端
                            out.write("Hi!\r\n".getBytes(Charset.forName("UTF-8")));
                            out.flush();

                            // 关闭连接
                            clientSocket.close();
                        } catch (IOException e) {
                            LOGGER.error(e.getMessage(), e);
                        } finally {
                            try {
                                clientSocket.close();
                            } catch (IOException e) {
                                // ignore on close
                            }
                        }
                    }
                    // 启动线程
                }).start();
            }
        } catch (IOException e) {
            LOGGER.error(e.getMessage(), e);
        }
    }
}
