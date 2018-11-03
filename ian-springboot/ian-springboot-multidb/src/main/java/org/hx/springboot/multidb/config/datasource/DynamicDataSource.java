package org.hx.springboot.multidb.config.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @ClassName DynamicDataSource
 * @Author hx 2018/11/2
 * @Description TODO
 * @Date 2018/11/2 13:44
 * @Version 1.0
 */
public class DynamicDataSource extends AbstractRoutingDataSource {


    @Override
    protected Object determineCurrentLookupKey() {
        return null;
    }
}
