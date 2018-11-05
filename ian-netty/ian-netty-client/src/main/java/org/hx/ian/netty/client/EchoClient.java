package org.hx.ian.netty.client;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetSocketAddress;

/**
 * @ClassName EchoClient
 * @Author hx 2018/11/3
 * @Description TODO
 * @Date 2018/11/3 13:08
 * @Version 1.0
 */
public class EchoClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(EchoClient.class);

    private final String host;

    private final int port;

    public EchoClient(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void start() throws InterruptedException {
        EventLoopGroup group = new NioEventLoopGroup();
        try {
            // 创建 Bootstrap
            Bootstrap bootstrap = new Bootstrap();

            // 指定 EventLoopGroup 以处理客户端事件，需要适用于 NIO 的实现
            bootstrap.group(group)

                    // 适用于 NIO 传输的 Channel 类型
                    .channel(NioSocketChannel.class)

                    // 设置服务器的 InetSocketAddress
                    .remoteAddress(new InetSocketAddress(host, port))

                    // 在创建 Channel 时，向 ChannelPipeline 中添加一个 EchoClientHandler 实例
                    .handler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel ch) throws Exception {
                            ch.pipeline().addLast(new EchoClientHandler());
                        }
                    });
            // 连接到远程节点，阻塞等待直到连接完成
            ChannelFuture future = bootstrap.connect().sync();

            // 阻塞，直到 Channel 关闭
            future.channel().closeFuture().sync();
        } finally {
            group.shutdownGracefully().sync();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        if (args.length != 2) {
            LOGGER.error("Usage: [{}] <host> <port>", EchoClient.class.getSimpleName());
            return;
        }

        String host = args[0];
        int port = Integer.parseInt(args[1]);
        new EchoClient(host, port).start();
    }
}
