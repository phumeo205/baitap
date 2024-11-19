package bai3;

import java.util.Scanner;

public class DiaChi {
	protected static String thon;
	protected static String xa;
	protected static String huyen;
	protected static String tinh;
	
	public DiaChi() {
	}

	public DiaChi(String thon, String xa, String huyen, String tinh) {
		this.thon = thon;
		this.xa = xa;
		this.huyen = huyen;
		this.tinh = tinh;
	}

	public String getThon() {
		return thon;
	}

	public void setThon(String thon) {
		this.thon = thon;
	}

	public String getXa() {
		return xa;
	}

	public void setXa(String xa) {
		this.xa = xa;
	}

	public String getHuyen() {
		return huyen;
	}

	public void setHuyen(String huyen) {
		this.huyen = huyen;
	}

	public String getTinh() {
		return tinh;
	}

	public void setTinh(String tinh) {
		this.tinh = tinh;
	}
	
	public static void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Thôn: ");
		thon = sc.nextLine();
		System.out.println("Xã: ");
		xa = sc.nextLine();
		System.out.println("Huyện: ");
		huyen = sc.nextLine();
	    System.out.println("Tỉnh: ");
	    tinh = sc.nextLine();
	}

	@Override
	public String toString() {
		return "DiaChi [thon=" + thon + ", xa=" + xa + ", huyen=" + huyen + ", tinh=" + tinh + "]";
	}

	
	
	
	
	

}
