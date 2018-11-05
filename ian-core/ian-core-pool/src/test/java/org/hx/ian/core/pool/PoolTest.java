package org.hx.ian.core.pool;

import org.hx.ian.core.pool.jdbc.JDBCConnectionFactory;
import org.hx.ian.core.pool.jdbc.JDBCConnectionValidator;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @ClassName PoolTest
 * @Author hx 2018/11/5
 * @Description 对象池测试用例
 * @Date 2018/11/5 16:37
 * @Version 1.0
 */
public class PoolTest {

    @Test
    public void testJdbcPool() {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/user_profile_data_cube?useUnicode=true&characterEncoding=utf-8" +
                "&useSSL=false";
        String userName = "root";
        String password = "root";
        int size = 10;
        ObjectFactory<Connection> objectFactory = new JDBCConnectionFactory(driver, url, userName, password);
        Pool.Validator<Connection> validator = new JDBCConnectionValidator();
        Pool<Connection> pool = PoolFactory.newBoundedNonBlockingPool(size, objectFactory, validator);
        for (int i = 0; i < 20; i++) {
            Connection connection = pool.get();
            System.out.println(i + ", " + connection);
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            pool.release(connection);
        }
        pool.shutdown();
    }
}
