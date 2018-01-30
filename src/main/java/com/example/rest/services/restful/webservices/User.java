package com.example.rest.services.restful.webservices;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "User variables and methods")
public class User {
	private int id;
	
	@Size(min=2)
	@ApiModelProperty(notes= "name should have atleast 2 characters")
	private String name;
	
	@Past
	@ApiModelProperty(notes= "date should be in past")
	private Date date;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getdate() {
		return date;
	}
	public void setBirthDate(Date date) {
		this.date = date;
	}
	public User(int id, String name, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
