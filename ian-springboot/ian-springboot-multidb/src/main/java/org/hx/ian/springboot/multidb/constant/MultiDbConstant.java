package org.hx.ian.springboot.multidb.constant;

/**
 * @ClassName MultiDbConstant
 * @Author hx 2018/11/5
 * @Description 多数据源常量类
 * @Date 2018/11/5 17:49
 * @Version 1.0
 */
public final class MultiDbConstant {

    public static final String BEAN_DATA_SOURCE_DB_ONE = "dbOneDataSource";

    public static final String BEAN_TRANSACTION_MANAGER_DB_ONE = "dbOneTransactionManager";

    public static final String BEAN_SQL_SESSION_FACTORY_DB_ONE = "dbOneSqlSessionFactory";

    public static final String DAO_PACKAGE_DB_ONE = "org.hx.ian.springboot.multidb.dao.dbone";

    public static final String XML_PACKAGE_DB_ONE = "classpath:mapper/dbone/*.xml";

    public static final String BEAN_DATA_SOURCE_DB_TWO = "dbTwoDataSource";

    public static final String BEAN_TRANSACTION_MANAGER_DB_TWO = "dbTwoTransactionManager";

    public static final String BEAN_SQL_SESSION_FACTORY_DB_TWO = "dbTwoSqlSessionFactory";

    public static final String DAO_PACKAGE_DB_TWO = "org.hx.ian.springboot.multidb.dao.dbtwo";

    public static final String XML_PACKAGE_DB_TWO = "classpath:mapper/dbtwo/*.xml";

}
