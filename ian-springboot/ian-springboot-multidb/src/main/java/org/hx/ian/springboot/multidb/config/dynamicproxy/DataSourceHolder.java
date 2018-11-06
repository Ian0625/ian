package org.hx.ian.springboot.multidb.config.dynamicproxy;

/**
 * @ClassName DataSourceHolder
 * @Author hx 2018/11/5
 * @Description 数据源句柄持有类
 * @Date 2018/11/5 17:10
 * @Version 1.0
 */
public class DataSourceHolder {

    private static ThreadLocal<String> DATA_SOURCE = new ThreadLocal<>();

    public static String getDataSource() {
        String source = DATA_SOURCE.get();
        if (source == null) {
            source = DataSourceType.DB1;
        }
        return source;
    }

    public static void setDataSource(String source) {
        DATA_SOURCE.set(source);
    }
}
