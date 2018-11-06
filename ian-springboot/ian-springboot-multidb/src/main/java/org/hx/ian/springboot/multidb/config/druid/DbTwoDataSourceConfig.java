package org.hx.ian.springboot.multidb.config.druid;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

import static org.hx.ian.springboot.multidb.constant.MultiDbConstant.*;

/**
 * @ClassName DbTwoDataSourceConfig
 * @Author hx 2018/11/5
 * @Description db 2 数据源配置类
 * @Date 2018/11/5 17:36
 * @Version 1.0
 */
@Configuration
@MapperScan(basePackages = DAO_PACKAGE_DB_TWO, sqlSessionFactoryRef = BEAN_SQL_SESSION_FACTORY_DB_TWO)
public class DbTwoDataSourceConfig {

    @Value("${db.two.datasource.url}")
    private String url;

    @Value("${db.two.datasource.username}")
    private String username;

    @Value("${db.two.datasource.password}")
    private String password;

    @Value("${db.two.datasource.driverClassName}")
    private String driverClass;

    @Bean(name = BEAN_DATA_SOURCE_DB_TWO)
    public DataSource dbTwoDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClass);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean(name = BEAN_TRANSACTION_MANAGER_DB_TWO)
    public DataSourceTransactionManager dbOneTransactionManager() {
        return new DataSourceTransactionManager(dbTwoDataSource());
    }

    @Bean(name = BEAN_SQL_SESSION_FACTORY_DB_TWO)
    public SqlSessionFactory dbOneSqlSessionFactory() throws Exception {
        final SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        sessionFactoryBean.setDataSource(dbTwoDataSource());
        sessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(XML_PACKAGE_DB_TWO));
        return sessionFactoryBean.getObject();
    }

}
