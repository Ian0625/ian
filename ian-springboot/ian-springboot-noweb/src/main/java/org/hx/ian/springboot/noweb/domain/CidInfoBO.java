package org.hx.ian.springboot.noweb.domain;

import org.hx.ian.common.BaseDomain;

/**
 * @ClassName CidInfoBO
 * @Author hx 2018/11/19
 * @Description cid 信息的BO
 * @Date 2018/11/19 15:47
 * @Version 1.0
 */
public class CidInfoBO extends BaseDomain {

  private Integer cid;

  private String name;

  private Integer pid;

  private Integer type;

  private Integer level;

  public Integer getCid() {
    return cid;
  }

  public void setCid(Integer cid) {
    this.cid = cid;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getPid() {
    return pid;
  }

  public void setPid(Integer pid) {
    this.pid = pid;
  }

  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }
}
