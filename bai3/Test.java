package bai3;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		NhanVien nhanvien = new NhanVien();
		nhanvien.nhapThongTin();
		
		System.out.println(nhanvien);
	}

}
