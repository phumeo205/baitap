package bai2;

import java.util.Scanner;

public class Test {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Address address = new Address();
		address.nhapThongTin();
		//sử dụng setter để gán thông tin
		address.setThon("Lai Xá");
		address.setXa("Hải Minh");
		address.setHuyen("Hải Hậu");
		address.setTinh("Nam Định");
		
		//Sử dụng getter để thông tin
		System.out.println("Thôn: "+address.getThon());
		System.out.println("Xã: "+address.getXa());
		System.out.println("Huyện: "+address.getHuyen());
		System.out.println("Tỉnh: "+address.getTinh());
		
		//Sử dụng toString để in chuỗi thông tin
		System.out.println(address);
	}

}
