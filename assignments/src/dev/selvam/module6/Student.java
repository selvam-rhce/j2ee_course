package dev.selvam.module6;

public class Student {

	private int id;
	private String name;
	private int std;
	private String gender;
	private int mark;
	private String address;
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
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", std=" + std + ", gender=" + gender + ", mark=" + mark
				+ ", address=" + address + "]";
	}
	
	
	
}
