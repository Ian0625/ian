package org.hx.ian.springboot.multidb.dao.dbtwo;

import org.hx.ian.springboot.multidb.domain.model.ConfigPlatformDO;

public interface ConfigPlatformDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ConfigPlatformDO record);

    int insertSelective(ConfigPlatformDO record);

    ConfigPlatformDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ConfigPlatformDO record);

    int updateByPrimaryKey(ConfigPlatformDO record);
}