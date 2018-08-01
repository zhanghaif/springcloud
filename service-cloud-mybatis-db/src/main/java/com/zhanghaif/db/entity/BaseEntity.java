package com.zhanghaif.db.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class BaseEntity implements Serializable {

	/**
	 * ID
	 */
	private String id;
	/**
	 * 是否有效
	 */
	private Boolean valid;
	/**
	 * 由谁创建
	 */
	private String createBy;
	/**
	 * 创建时间
	 */
	private String createTime;
	/**
	 * 最后修改者
	 */
	private String updateBy;
	/**
	 * 最后修改时间
	 */
	private String updateTime;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Boolean getValid() {
		return valid;
	}
	public void setValid(Boolean valid) {
		this.valid = valid;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	
	
}
