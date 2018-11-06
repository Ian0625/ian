package org.hx.ian.springboot.multidb.config.dynamicproxy;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @ClassName DynamicDataSource
 * @Author hx 2018/11/5
 * @Description 动态数据源选择
 * @Date 2018/11/5 17:10
 * @Version 1.0
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceHolder.getDataSource();
    }
}
