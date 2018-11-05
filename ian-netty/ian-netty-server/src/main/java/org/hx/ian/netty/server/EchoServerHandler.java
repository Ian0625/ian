package org.hx.ian.netty.server;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.CharsetUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName EchoServerHandler
 * @Author hx 2018/11/3
 * @Description TODO
 * @Date 2018/11/3 13:11
 * @Version 1.0
 */
// 标示一个 ChannelHandler 可以被多个 Channel 安全地共享
@ChannelHandler.Sharable
public class EchoServerHandler extends ChannelInboundHandlerAdapter {

    private static final Logger LOGGER = LoggerFactory.getLogger(EchoServerHandler.class);

    /**
     * 对于每一个传入的消息都要调用
     *
     * @param ctx 上下文
     * @param msg 消息
     * @throws Exception 异常
     */
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {

        LOGGER.info("call channelRead");

        ByteBuf in = (ByteBuf) msg;
        // 将消息记录到日志
        LOGGER.info("Server received: [{}]", in.toString(CharsetUtil.UTF_8));

        // 将接收到的消息写给发送者，而不冲刷出站消息
        ctx.write(in);
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {

        LOGGER.info("call channelReadComplete");

        // 将未决消息冲刷到远程节点，并且关闭该 Channel
        ctx.writeAndFlush(Unpooled.EMPTY_BUFFER).addListener(ChannelFutureListener.CLOSE);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        // 打印异常栈跟踪
        cause.printStackTrace();

        // 关闭该 Channel
        ctx.close();
    }
}
