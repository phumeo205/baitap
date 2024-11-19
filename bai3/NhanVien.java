package bai3;

import java.util.Scanner;

public class NhanVien {
	protected String name;
	protected DiaChi address;
	protected String dob;
	protected String gender;
	
	public NhanVien() {
	}

	public NhanVien(String name, DiaChi address, String dob, String gender) {
		this.name = name;
		this.address = new DiaChi();
		this.dob = dob;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DiaChi getAddress() {
		return address;
	}

	public void setAddress(DiaChi address) {
		this.address = address;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ten nhan vien: ");
		name = sc.nextLine();
		System.out.println("Dia chỉ ");
		address.nhapThongTin();
		System.out.println("Ngay sinh: ");
		dob = sc.nextLine();
		System.out.println("Gioi tinh: ");
		gender = sc.nextLine();
	}

	@Override
	public String toString() {
		return "NhanVien [name=" + name + ", address=" + address + ", dob=" + dob + ", gender=" + gender + "]";
	}
	
	
	

}
