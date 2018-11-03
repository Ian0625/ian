package org.hx.springboot.multidb.pool;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author hx 2018/10/31
 * @desc
 */
public class JDBCConnectionValidator implements Pool.Validator<Connection> {


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
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
