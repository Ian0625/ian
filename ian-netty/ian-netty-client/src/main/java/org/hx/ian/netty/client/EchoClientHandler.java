package org.hx.ian.netty.client;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.CharsetUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName EchoClientHandler
 * @Author hx 2018/11/3
 * @Description TODO
 * @Date 2018/11/3 13:08
 * @Version 1.0
 */
// 标记该类的实例可以被多个 Channel 共享
@ChannelHandler.Sharable
public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {

    private static final Logger LOGGER = LoggerFactory.getLogger(EchoClientHandler.class);

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {

        LOGGER.info("call channelActive");

        // 当被通知 Channel 是活跃的时候，发送一条消息
        ctx.writeAndFlush(Unpooled.copiedBuffer("Netty rocks!", CharsetUtil.UTF_8));
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {

        LOGGER.info("call channelRead0");

        // 记录已接收消息的转储
        LOGGER.info("Client received: [{}]", msg.toString(CharsetUtil.UTF_8));
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        // 当异常发生时，记录错误并关闭 Channel
        cause.printStackTrace();
        ctx.close();
    }
}
