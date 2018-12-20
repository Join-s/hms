package com.luban.po;

import java.util.List;

public class TSubclass {
    private Integer id;//元件小类编号

    private Integer lid;//元件大类编号

    private String name;//元件小类名称
    //一对一 元件大类
    private TLargeclass tLargeclass;
    //一对多 元件
    private List<TComponent> clist;

    public List<TComponent> getClist() {
		return clist;
	}

	public void setClist(List<TComponent> clist) {
		this.clist = clist;
	}

	public TLargeclass gettLargeclass() {
		return tLargeclass;
	}

	public void settLargeclass(TLargeclass tLargeclass) {
		this.tLargeclass = tLargeclass;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}