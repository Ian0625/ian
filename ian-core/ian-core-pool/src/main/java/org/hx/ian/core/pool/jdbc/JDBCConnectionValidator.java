package org.hx.ian.core.pool.jdbc;

import org.hx.ian.core.pool.Pool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @ClassName JDBCConnectionValidator
 * @Author hx 2018/11/5
 * @Description JDBC 连接验证器
 * @Date 2018/11/5 16:29
 * @Version 1.0
 */
public class JDBCConnectionValidator implements Pool.Validator<Connection> {

    private static final Logger LOGGER = LoggerFactory.getLogger(JDBCConnectionValidator.class);

    @Override
    public boolean isValid(Connection connection) {
        if (connection == null) {
            return false;
        }
        try {
            return !connection.isClosed();
        } catch (SQLException e) {
            return false;
        }
    }

    @Override
    public void invalidate(Connection connection) {
        try {
            connection.close();
            LOGGER.info("The connection is close!");
        } catch (SQLException e) {
            LOGGER.error(e.getMessage(), e);
        }
    }
}
