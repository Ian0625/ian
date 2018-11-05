package org.hx.ian.netty.server;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoop;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetSocketAddress;

/**
 * @ClassName EchoServer
 * @Author hx 2018/11/3
 * @Description TODO
 * @Date 2018/11/3 13:11
 * @Version 1.0
 */
public class EchoServer {

    private static final Logger LOGGER = LoggerFactory.getLogger(EchoServer.class);

    private final int port;

    public EchoServer(int port) {
        this.port = port;
    }

    public static void main(String[] args) throws InterruptedException {
        if (args.length != 1) {
            LOGGER.error("Usage: [{}] <port>", EchoServer.class.getSimpleName());
            return;
        }

        // 设置端口值
        int port = Integer.parseInt(args[0]);

        // 调用服务器的 start() 方法
        new EchoServer(port).start();

    }

    /**
     * 启动服务
     *
     * @throws InterruptedException
     */
    public void start() throws InterruptedException {
        final EchoServerHandler serverHandler = new EchoServerHandler();

        // 1、创建 EventLoopGroup
        EventLoopGroup group = new NioEventLoopGroup();
        try {

            // 2、创建 ServerBootStrap
            ServerBootstrap bootstrap = new ServerBootstrap();
            bootstrap.group(group)

                    // 3、指定所使用的 NIO 传输 Channel
                    .channel(NioServerSocketChannel.class)

                    // 4、使用指定的端口设置套接字地址
                    .localAddress(new InetSocketAddress(port))

                    // 5、添加一个 EchoServerHandler 到子 Channel 的 ChannelPipeline
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel ch) throws Exception {

                            // EchoServerHandler 被标注为 @Shareable，所以我们可以总是使用同样的实例
                            ch.pipeline().addLast(serverHandler);
                        }
                    });

            // 6、异步地绑定服务器；调用 sync() 方法阻塞等待直到绑定完成
            ChannelFuture future = bootstrap.bind().sync();

            // 7、获取 Channel 的 closeFuture()，并且阻塞当前线程直到它完成
            future.channel().closeFuture().sync();
        } finally {

            // 8、关闭 EventLoopGroup，释放所有的资源
            group.shutdownGracefully().sync();
        }
    }
}
