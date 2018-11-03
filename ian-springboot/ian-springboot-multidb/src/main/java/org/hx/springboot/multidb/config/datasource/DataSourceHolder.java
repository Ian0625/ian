package org.hx.springboot.multidb.config.datasource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName DataSourceHolder
 * @Author hx 2018/11/2
 * @Description TODO
 * @Date 2018/11/2 13:45
 * @Version 1.0
 */
public class DataSourceHolder {

    private static final Logger LOGGER = LoggerFactory.getLogger(DataSourceHolder.class);

    private static ThreadLocal<String> DATA_SOURCES = new ThreadLocal<>();

    public static String getDataSources() {
        String source = DATA_SOURCES.get();
        if (null == source) {
            LOGGER.error("datasource is null");
        }
        return source;
    }

    public static void setDataSources(String source) {
        if (null == source) {
            LOGGER.error("datasource is null");
        }
        DATA_SOURCES.set(source);
    }
}
