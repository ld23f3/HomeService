package com.etc.util;


import java.util.List;

/**
 * 分页数据类
 */
public class PageData<T> {
	private List<T> data; // 查找的数据

	private Integer total; // 总数

	private Integer pageSize;// 每页几行

	private Integer page;// 页数
	
	private Integer totalPage;//总页数
	
	public PageData() {
		super();
	}
	
	public PageData(List<T> data, Integer total, Integer pageSize, Integer page, Integer totalPage) {
		super();
		this.data = data;
		this.total = total;
		this.pageSize = pageSize;
		this.page = page;
		this.totalPage = totalPage;
	}

	public PageData(List<T> data, Integer total, Integer pageSize, Integer page) {
		super();
		this.data = data;
		this.total = total;
		this.pageSize = pageSize;
		this.page = page;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public int getTotalPage() {
		int num = total / pageSize;
		if (total % pageSize != 0)
			num++;
		totalPage = num;
		return totalPage;
	}
	
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	@Override
	public String toString() {
		return "{total:" + total + ",data:" + data + "}";
	}
}
