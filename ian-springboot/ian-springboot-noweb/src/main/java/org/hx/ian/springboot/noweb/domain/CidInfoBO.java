package org.hx.ian.springboot.noweb.domain;

/**
 * @ClassName CidInfoBO
 * @Author hx 2018/11/19
 * @Description cid 信息的BO
 * @Date 2018/11/19 15:47
 * @Version 1.0
 */
public class CidInfoBO {

  private Integer cid;

  private String name;

  private Integer pid;

  private Integer type;

  private Integer level;

  private Long createTime;

  private Long lastUpdateTime;

  private Integer operator;

  private Long datep;

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

  public Long getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }

  public Long getLastUpdateTime() {
    return lastUpdateTime;
  }

  public void setLastUpdateTime(Long lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
  }

  public Integer getOperator() {
    return operator;
  }

  public void setOperator(Integer operator) {
    this.operator = operator;
  }

  public Long getDatep() {
    return datep;
  }

  public void setDatep(Long datep) {
    this.datep = datep;
  }
}
