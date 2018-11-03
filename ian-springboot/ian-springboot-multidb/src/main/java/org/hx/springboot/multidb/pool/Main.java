package org.hx.springboot.multidb.pool;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author hx 2018/10/31
 * @desc
 */
public class Main {

    public static void main(String[] args) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/user_profile_data_cube?useUnicode=true&characterEncoding=utf-8" +
                "&useSSL=false";
        String userName = "root";
        String password = "root";
//        Pool<Connection> pool = new BoundedBlockingPool<>(
//                10,
//                new JDBCConnectionValidator(),
//                new JDBCConnectionFactory(driver, url, userName, password));
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
