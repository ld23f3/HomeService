package com.etc.test;

public class TestMyAddres {
	private String id;
	private String name;
	private String parent_id;
	private String code;
	private String order;
	
	
	
	public TestMyAddres() {
		super();
	}
	public TestMyAddres(String id, String name, String parent_id, String code, String order) {
		super();
		this.id = id;
		this.name = name;
		this.parent_id = parent_id;
		this.code = code;
		this.order = order;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getParent_id() {
		return parent_id;
	}
	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	@Override
	public String toString() {
		return "TestMyAddres [id=" + id + ", name=" + name + ", parent_id=" + parent_id + ", code=" + code + ", order="
				+ order + "]";
	}
	
}
