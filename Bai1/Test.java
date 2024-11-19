package Bai1;

import java.util.Scanner;

public class Test {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Person person = new Person();
		person.nhapThongTin();
		
		//Sử dụng setter để gán giá trị
		Person person1 = new Person();
		person1.nhapThongTin();
		person1.setName();
		person1.setDob();
		person1.setPod();
		person1.setGender();
		person1.setEmail();
		person1.setPhone();
		
		//Sử dụng getter để lấy giá trị
		System.out.println("Tên: "+person1.getName());
		System.out.println("Ngày sinh: "+person1.getDob());
		System.out.println("Nơi Sinh: "+person1.getPod());
		System.out.println("Giới tinh: "+person1.getGender());
		System.out.println("email: "+person1.getEmail());
		System.out.println("Số điện thoại: "+person1.getPhone());
		
		//Sử dụng toString() để in thông tin đối tượng
		System.out.println(person);
		
	}

}
