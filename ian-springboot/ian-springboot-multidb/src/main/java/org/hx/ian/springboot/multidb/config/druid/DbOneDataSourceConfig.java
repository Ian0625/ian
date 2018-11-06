package org.hx.ian.springboot.multidb.config.druid;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

import static org.hx.ian.springboot.multidb.constant.MultiDbConstant.*;

/**
 * @ClassName DbOneDataSourceConfig
 * @Author hx 2018/11/5
 * @Description db 1 数据源配置类
 * @Date 2018/11/5 17:36
 * @Version 1.0
 */
@Configuration
@MapperScan(basePackages = DAO_PACKAGE_DB_ONE, sqlSessionFactoryRef = BEAN_SQL_SESSION_FACTORY_DB_ONE)
public class DbOneDataSourceConfig {

    @Value("${db.one.datasource.url}")
    private String url;

    @Value("${db.one.datasource.username}")
    private String username;

    @Value("${db.one.datasource.password}")
    private String password;

    @Value("${db.one.datasource.driverClassName}")
    private String driverClass;

    @Primary
    @Bean(name = BEAN_DATA_SOURCE_DB_ONE)
    public DataSource dbOneDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClass);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Primary
    @Bean(name = BEAN_TRANSACTION_MANAGER_DB_ONE)
    public DataSourceTransactionManager dbOneTransactionManager() {
        return new DataSourceTransactionManager(dbOneDataSource());
    }

    @Primary
    @Bean(name = BEAN_SQL_SESSION_FACTORY_DB_ONE)
    public SqlSessionFactory dbOneSqlSessionFactory() throws Exception {
        final SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        sessionFactoryBean.setDataSource(dbOneDataSource());
        sessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(XML_PACKAGE_DB_ONE));
        return sessionFactoryBean.getObject();
    }

}
