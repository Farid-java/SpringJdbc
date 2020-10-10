package com.jdbc.springJdbc;

public class Student {

	private int id;
	private String name;
	private String collegename;
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", collegename="+collegename+"]";
	}
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
	public  String getCollegename() {
		return collegename;
	}
	public  void setCollegename(String collegename) {
		this.collegename = collegename;
	}
}
