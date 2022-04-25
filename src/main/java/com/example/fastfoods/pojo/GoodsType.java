package com.example.fastfoods.pojo;
public class GoodsType {
	private int id;
	private String name;
	private int level;
	private int flag;
	private String parentName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	@Override
	public String toString() {
		return "GoodsType [id=" + id + ", name=" + name + ", level=" + level + ", flag=" + flag + ", parentName="
				+ parentName + "]";
	}
	
}