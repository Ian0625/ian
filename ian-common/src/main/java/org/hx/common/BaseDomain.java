package org.hx.common;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * @ClassName BaseDomain
 * @Author hx 2018/11/1
 * @Description 基础父类
 * @Date 2018/11/1 17:03
 * @Version 1.0
 */
public class BaseDomain implements Serializable {

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}
