package com.luban.po;

public class TMajor {
    private Integer id;//专业编号

    private Integer depid;//学院编号

    private String name;//专业名称
//学院
    
    private TDepartment tDepartment;
    
    public TDepartment gettDepartment() {
		return tDepartment;
	}

	public void settDepartment(TDepartment tDepartment) {
		this.tDepartment = tDepartment;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDepid() {
        return depid;
    }

    public void setDepid(Integer depid) {
        this.depid = depid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}