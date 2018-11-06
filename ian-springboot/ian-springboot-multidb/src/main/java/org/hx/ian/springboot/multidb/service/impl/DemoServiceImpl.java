package org.hx.ian.springboot.multidb.service.impl;

import org.hx.ian.springboot.multidb.dao.dbone.ConfigProvinceCityDOMapper;
import org.hx.ian.springboot.multidb.dao.dbtwo.ConfigPlatformDOMapper;
import org.hx.ian.springboot.multidb.domain.model.ConfigPlatformDO;
import org.hx.ian.springboot.multidb.domain.model.ConfigProvinceCityDO;
import org.hx.ian.springboot.multidb.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName DemoServiceImpl
 * @Author hx 2018/11/6
 * @Description 服务实现类
 * @Date 2018/11/6 09:14
 * @Version 1.0
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private ConfigProvinceCityDOMapper configProvinceCityDOMapper;

    @Autowired
    private ConfigPlatformDOMapper configPlatformDOMapper;

    @Override
    public String getDemo() {
        int id = 1;
        ConfigProvinceCityDO configProvinceCityDO = configProvinceCityDOMapper.selectByPrimaryKey(1L);
        ConfigPlatformDO platformDO = configPlatformDOMapper.selectByPrimaryKey(id);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(configProvinceCityDO.getCityName()).append("-").append(platformDO.getPlatformName());
        return stringBuilder.toString();
    }
}
