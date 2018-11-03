package org.hx.springboot.multidb.config.properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.PathResource;
import org.springframework.core.io.Resource;
import org.springframework.util.StringUtils;

/**
 * @ClassName PropertiesConfig
 * @Author hx 2018/11/1
 * @Description properties 配置类
 * @Date 2018/11/1 20:04
 * @Version 1.0
 */
@Configuration
public class PropertiesConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(PropertiesConfig.class);

    @Bean
    public static PropertySourcesPlaceholderConfigurer createPropertyPlaceholder() {
        Resource[] resource = listResources();
        PropertySourcesPlaceholderConfigurer propertyLoader = new PropertySourcesPlaceholderConfigurer();
        propertyLoader.setLocations(resource);
        return propertyLoader;
    }

    private static Resource[] listResources() {
        String[] fileNames = listConfigProperties();
        String confPath = System.getProperty("base.config.dir");
        LOGGER.info("base.config.dir [{}]", confPath);
        int fileSize = fileNames.length;
        Resource[] resources = new Resource[fileSize];
        for (int i = 0; i < fileSize; i++) {
            String fileName = fileNames[i];
            Resource resource = getResource(confPath, fileName);
            resources[i] = resource;
        }
        return resources;
    }

    private static Resource getResource(String confPath, String fileName) {
        Resource resource = null;
        String filePath = null;
        if (StringUtils.isEmpty(confPath)) {
            confPath = "local/";
            filePath = new StringBuffer().append(confPath).append(fileName).toString();
            resource = new ClassPathResource(filePath);
        } else {
            filePath = new StringBuffer().append(confPath).append(fileName).toString();
            resource = new PathResource(filePath);
        }
        return resource;
    }

    private static String[] listConfigProperties() {
        // 添加需要修改的配置文件
        return new String[]{"demo.properties", "server.properties"};
    }
}
