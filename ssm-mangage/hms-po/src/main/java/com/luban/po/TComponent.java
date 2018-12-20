package com.luban.po;

import java.util.Date;

public class TComponent {
    private Integer id;//id

    private Integer sid;//元件小类编号

    private String name;//名称

    private Date createtime;//创建时间

    private Date updatetime;//更新时间

    private String specification;//规格

    private String val;//值

    private String img;//图片

    private String introduce;//介绍

    private Float price;//单价

    private String malllink;//商城链接

    private Integer store;//库存

    private String isstore;//是否入库 1：入库 0：没有入库

    private String place;//库存位置

    private Integer level;//申领等级 默认100

    private String sealing;//元件封装链接

    private String updownlink;//下载连接

    private String brand;//品牌

    private String version;//原厂型号

    private String remark1;//包装类型

    private String remark2;//品牌等级

    private String remark3;//暂无
    //一对一 元件小类
    private TSubclass tSubclass;


	public TSubclass gettSubclass() {
		return tSubclass;
	}

	public void settSubclass(TSubclass tSubclass) {
		this.tSubclass = tSubclass;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val == null ? null : val.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getMalllink() {
        return malllink;
    }

    public void setMalllink(String malllink) {
        this.malllink = malllink == null ? null : malllink.trim();
    }

    public Integer getStore() {
        return store;
    }

    public void setStore(Integer store) {
        this.store = store;
    }

    public String getIsstore() {
        return isstore;
    }

    public void setIsstore(String isstore) {
        this.isstore = isstore == null ? null : isstore.trim();
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getSealing() {
        return sealing;
    }

    public void setSealing(String sealing) {
        this.sealing = sealing == null ? null : sealing.trim();
    }

    public String getUpdownlink() {
        return updownlink;
    }

    public void setUpdownlink(String updownlink) {
        this.updownlink = updownlink == null ? null : updownlink.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
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
}