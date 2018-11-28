package org.hx.ian.designweight.flyweight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName ConnectionPool
 * @Author hx 2018/11/21
 * @Description TODO
 * @Date 2018/11/21 21:06
 * @Version 1.0
 */
public class ConnectionPool {

  private static final Logger LOGGER = LoggerFactory.getLogger(ConnectionPool.class);

  private Vector<Connection> pool;

  // 公有属性
  private String url = "jdbc:mysql://localhost:3306/test";
  private String username = "root";
  private String password = "root";
  private String driverClassname = "com.mysql.jdbc.Driver";

  private int poolSize = 100;
  private static ConnectionPool instance = null;
  Connection connection = null;

  private ConnectionPool() {
    pool = new Vector<>(poolSize);
    for (int i = 0; i < poolSize; i++) {
      try {
        Class.forName(driverClassname);
        connection = DriverManager.getConnection(url, username, password);
        pool.add(connection);
      } catch (ClassNotFoundException e) {
        e.printStackTrace();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }

  public synchronized void release() {
    pool.add(connection);
  }

  public synchronized Connection getConnection() {
    if (pool.size() > 0) {
      Connection connection = pool.get(0);
      pool.remove(connection);
      return connection;
    } else {
      return null;
    }
  }


  public static void main(String[] args) {
    Long[] gids = {1000005675L, 1000013400L, 1000014722L, 1000019239L};
    Integer num = 2;

  }

}
