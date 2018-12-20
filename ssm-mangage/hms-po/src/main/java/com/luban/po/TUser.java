package com.luban.po;

import java.util.Date;
import java.util.List;

public class TUser {
	private Integer id;// 用户编号

	private Integer graid;// 班级编号

	private String name;// 名称

	private String photo;// 头像

	private String introduce;// 介绍

	private String jnumber;// 学号/工号

	private String sex;// 性别

	private String tel;// 电话

	private String qq;

	private Integer level;// 申领权限

	private Integer honourval;// 荣耀值

	private String isgraduate;// 是否毕业1：已毕业

	private Integer intime;// 入学年份

	private String pwd;// 密码

	private String seat;// 座位号

	private String yjnum;// 实验室编号

	private Date createtime;// 创建时间

	private Date updatetime;// 更新时间

	private String remark1;// 类型 1:管理员 0:学生

	private String remark2;//邮箱

	private String remark3;

	private String remark4;

	private String remark5;

	// 订单,一对多
	private List<TOrders> tOrders;
	
	//班级
	private TGrade tGrade;
	
	

	public TGrade gettGrade() {
		return tGrade;
	}

	public void settGrade(TGrade tGrade) {
		this.tGrade = tGrade;
	}

	public List<TOrders> gettOrders() {
		return tOrders;
	}

	public void settOrders(List<TOrders> tOrders) {
		this.tOrders = tOrders;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getGraid() {
		return graid;
	}

	public void setGraid(Integer graid) {
		this.graid = graid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo == null ? null : photo.trim();
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce == null ? null : introduce.trim();
	}

	public String getJnumber() {
		return jnumber;
	}

	public void setJnumber(String jnumber) {
		this.jnumber = jnumber == null ? null : jnumber.trim();
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex == null ? null : sex.trim();
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel == null ? null : tel.trim();
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq == null ? null : qq.trim();
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getHonourval() {
		return honourval;
	}

	public void setHonourval(Integer honourval) {
		this.honourval = honourval;
	}

	public String getIsgraduate() {
		return isgraduate;
	}

	public void setIsgraduate(String isgraduate) {
		this.isgraduate = isgraduate == null ? null : isgraduate.trim();
	}

	public Integer getIntime() {
		return intime;
	}

	public void setIntime(Integer intime) {
		this.intime = intime;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd == null ? null : pwd.trim();
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat == null ? null : seat.trim();
	}

	public String getYjnum() {
		return yjnum;
	}

	public void setYjnum(String yjnum) {
		this.yjnum = yjnum == null ? null : yjnum.trim();
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

	public String getRemark1() {
		return remark1;
	}

	public void setRemark1(String remark1) {
		this.remark1 = remark1 == null ? null : remark1.trim();
	}

	public String getRemark2() {
		return remark2;
	}

	public void setRemark2(String remark2) {
		this.remark2 = remark2 == null ? null : remark2.trim();
	}

	public String getRemark3() {
		return remark3;
	}

	public void setRemark3(String remark3) {
		this.remark3 = remark3 == null ? null : remark3.trim();
	}

	public String getRemark4() {
		return remark4;
	}

	public void setRemark4(String remark4) {
		this.remark4 = remark4 == null ? null : remark4.trim();
	}

	public String getRemark5() {
		return remark5;
	}

	public void setRemark5(String remark5) {
		this.remark5 = remark5 == null ? null : remark5.trim();
	}
}