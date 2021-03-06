package com.shenke.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 包装实体类
 * 
 * @author Administrator
 *
 */
@Entity
@Table(name = ("t_pack"))
public class Pack {

	@Id
	@GeneratedValue
	private Integer id;

	@Column(length = 50)
	private String name;

	@Column(length = 50)
	private String help;

	@Column(length = 500)
	private String remark;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "Pack [id=" + id + ", name=" + name + ", help=" + help + ", remark=" + remark + "]";
	}

}
