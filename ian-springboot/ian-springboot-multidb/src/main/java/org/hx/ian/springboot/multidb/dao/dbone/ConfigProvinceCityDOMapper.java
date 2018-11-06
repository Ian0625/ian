package org.hx.ian.springboot.multidb.dao.dbone;

import org.hx.ian.springboot.multidb.domain.model.ConfigProvinceCityDO;

public interface ConfigProvinceCityDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ConfigProvinceCityDO record);

    int insertSelective(ConfigProvinceCityDO record);

    ConfigProvinceCityDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ConfigProvinceCityDO record);

    int updateByPrimaryKey(ConfigProvinceCityDO record);
}