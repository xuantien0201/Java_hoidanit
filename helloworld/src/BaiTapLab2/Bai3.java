package BaiTapLab2;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
//		bai 3
		System.out.println("Nhập vào số điện: ");
		Scanner sc = new Scanner(System.in);
		int soDien = sc.nextInt();
		if(soDien > 0 && soDien <= 100) {
			System.out.println("Giá mỗi số điện là 1000, tiền điện là: " + (soDien * 1000));
		}if(soDien > 100) {
			System.out.println("Giá mỗi số điện là 1500, tiền điện là: " + ((100 * 1000) + (soDien - 100) * 1500));
		}
		sc.close();
	}
}
