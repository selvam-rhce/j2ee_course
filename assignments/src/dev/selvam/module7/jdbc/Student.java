package dev.selvam.module7.jdbc;

public class Student {

	private int stID;
	private String name;
	private int std_class;
	private int marks;
	
	
	
	public Student() {
		super();
	}

	public Student(int iD, String name, int std_class, int marks) {
		super();
		stID = iD;
		this.name = name;
		this.std_class = std_class;
		this.marks = marks;
	}
	
	public int getID() {
		return stID;
	}
	public void setID(int iD) {
		stID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStd_class() {
		return std_class;
	}
	public void setStd_class(int std_class) {
		this.std_class = std_class;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [stID=" + stID + ", name=" + name + ", std_class=" + std_class + ", marks=" + marks + "]";
	}
	
	

}
