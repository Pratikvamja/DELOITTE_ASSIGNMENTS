package com.tektaurus.bean;

public class Employee {

	private int eid;
	private String name;
	private String mobile;
	private String address;
	private String jd;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getJd() {
		return jd;
	}
	public void setJd(String jd) {
		this.jd = jd;
	}
	public Employee(int eid, String name, String mobile, String address,
			String jd) {
		super();
		this.eid = eid;
		this.name = name;
		this.mobile = mobile;
		this.address = address;
		this.jd = jd;
	}
	@Override
	public String toString() {
		return "Student [sid=" + eid + ", name=" + name + ", mobile=" + mobile
				+ ", address=" + address + ", stream=" + jd + "]";
	}
}
