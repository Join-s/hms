package com.luban.po;

import java.util.Date;
import java.util.List;

public class TOrders {
    private Integer id;//订单编号

    private Integer uid;//用户编号

    private Date createtime;//创建时间

    private Date updatetime;//更新时间

    private String status;//状态 0:未提交 1：未审核 2：已审核 3：打回

    private String remark;//备注
    //订单详情，一对多
    private List<TOrderdetails> tOrderdetails;
    
    public List<TOrderdetails> gettOrderdetails() {
		return tOrderdetails;
	}

	public void settOrderdetails(List<TOrderdetails> tOrderdetails) {
		this.tOrderdetails = tOrderdetails;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}