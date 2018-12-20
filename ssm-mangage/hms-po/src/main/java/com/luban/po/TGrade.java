package com.luban.po;

public class TGrade {
    private Integer id;//班级编号

    private Integer magid;//专业编号

    private String name;//班级名称

    private Integer year;//年级

    private String tutor;//辅导员

    private String tutortel;//辅导员电话

    
    //专业
    private TMajor tMajor;
    
    
    public TMajor gettMajor() {
		return tMajor;
	}

	public void settMajor(TMajor tMajor) {
		this.tMajor = tMajor;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMagid() {
        return magid;
    }

    public void setMagid(Integer magid) {
        this.magid = magid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor == null ? null : tutor.trim();
    }

    public String getTutortel() {
        return tutortel;
    }

    public void setTutortel(String tutortel) {
        this.tutortel = tutortel == null ? null : tutortel.trim();
    }
}