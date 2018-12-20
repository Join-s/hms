package com.luban.po;

public class TOrderdetails {
	private Integer id;//订单项编号

	private Integer cid;//元件编号

	private Integer oid;//订单编号

	private Integer number;//数量
	// 元件详情，一对一
	private TComponent tComponent;

	public TComponent gettComponent() {
		return tComponent;
	}

	public void settComponent(TComponent tComponent) {
		this.tComponent = tComponent;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public Integer getOid() {
		return oid;
	}

	public void setOid(Integer oid) {
		this.oid = oid;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
}