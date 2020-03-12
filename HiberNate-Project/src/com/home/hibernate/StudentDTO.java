package com.home.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentDTO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sId;
	private String name;
	private int age;
	private long mobileNo;
	private int YPO;
	private double per;
	private String strem;
	
	
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age>=18 && age<=60)
		{
			this.age = age;
		}
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public int getYPO() {
		return YPO;
	}
	public void setYPO(int yPO) {
		YPO = yPO;
	}
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}
	public String getStrem() {
		return strem;
	}
	public void setStrem(String strem) {
		this.strem = strem;
	}
	public String toString()
	{
		return "StudentDTO {id = " +getsId() +",name = "+getName()+",Age = "+getAge()+", Mobile No= "+getMobileNo()+
				", YOP = "+getYPO()+",Per% ="+getPer()+",Stream = "+getStrem()+"}";
	}
		

}
