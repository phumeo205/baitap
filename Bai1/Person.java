package Bai1;

import java.util.Scanner;

import jse.main;

public class Person {
	public String name;
	public String dob;
	public String pod;
	public String gender;
	public String email;
	public String phone;
	
	public Person() {
	}

	public Person(String name, String dob, String pod, String gender, String email, String phone) {
		this.name = name;
		this.dob = dob;
		this.pod = pod;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName() {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob() {
		this.dob = dob;
	}

	public String getPod() {
		return pod;
	}

	public void setPod() {
		this.pod = pod;
	}

	public String getGender() {
		return gender;
	}

	public void setGender() {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail() {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone() {
		this.phone = phone;
	}
	
	public void nhapThongTin() {
		Scanner sc =new Scanner(System.in);
		System.out.print("Ten: ");
		name = sc.nextLine();
		System.out.print("Ngay sinh: ");
		dob = sc.nextLine();
		System.out.print("Noi sinh: ");
		pod = sc.nextLine();
		System.out.print("Gioi tinh: ");
		gender = sc.nextLine();
		System.out.print("Email: ");
		email = sc.nextLine();
		System.out.print("So dien thoai: ");
		phone = sc.nextLine();
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", dob=" + dob + ", pod=" + pod + ", gender=" + gender + ", email=" + email
				+ ", phone=" + phone + "]";
	}
	

}

