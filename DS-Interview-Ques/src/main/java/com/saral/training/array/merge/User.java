package com.saral.training.array.merge;

public class User {

	String name;
	int id;
	String address;


	public User(int id, String name,  String address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", address=" + address + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
