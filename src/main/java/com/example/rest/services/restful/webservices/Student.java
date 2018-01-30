package com.example.rest.services.restful.webservices;

public class Student {

	 private String name;
	 private int sno;
	 private String place;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", sno=" + sno + ", place=" + place + "]";
	}
	public Student(String name, int sno, String place) {
		super();
		this.name = name;
		this.sno = sno;
		this.place = place;
	}
	
	public String display() {
		return this.name + " " + this.sno +" " + this.place;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	 
	
	
}
