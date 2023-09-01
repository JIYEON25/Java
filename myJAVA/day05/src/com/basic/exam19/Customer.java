package com.basic.exam19;

public class Customer {
	
	// 18) 저장 변수 선언
	private String name;
	private int age;
	private String phone;
	private String address;
	
	// 19) 기본 생성자
	public Customer() {
	}
	
	// 20) 생성자
	public Customer(String name, int age, String phone, String address) {
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}

	// 21) getter/setter
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
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// 22) toString() 생성
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", phone=" + phone + ", address=" + address + "]";
	}
}
