package BaiTapLab2;

import java.util.Scanner;

public class Bai4 {
	public static void bai1() {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG 01 <<");
		System.out.println("Nhập số nguyên thứ nhất: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Nhập số nguyên thứ hai: ");
		int b = sc.nextInt();
		if (a == 0 && b == 0) {
			System.out.println("Phương trình có vô số nghiệm");
		} else if (a == 0) {
			System.out.println("Phương trình vô nghiệm");
		} else {
			System.out.println("Phương trình có nghiệm duy nhất là: " + (-b / a));
		}
		sc.close();
	}

	public static void bai2(int a, int b, int c) {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG 02 <<");
		if (a == 0) {
			if (b == 0) {
				if (c == 0) {
					System.out.println("Phương trình vô số nghiệm");
				} else {
					System.out.println("Phương trình vô nghiệm");
				}
			} else {
				System.out.println("Phương trình có nghiệm duy nhất: " + (-c / b));
			}
		} else {
			float delta = b * b - 4 * a * c;
			if (delta < 0) {
				System.out.println("Phương trình vô nghiệm");
			} else if (delta == 0) {
				System.out.println("Phương trình có nghiệm kép: " + (-b / (2 * a)));
			} else {
				System.out.println("Phương trình có nghiệm 2 nghiệm: ");
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println(x1 + " và " + x2);
			}
		}
	}

	public static void bai3() {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG 03 <<");
		System.out.println("Nhập vào số điện: ");
		Scanner sc = new Scanner(System.in);
		int soDien = sc.nextInt();
		if (soDien > 0 && soDien <= 100) {
			System.out.println("Giá mỗi số điện là 1000, tiền điện là: " + (soDien * 1000));
		}
		if (soDien > 100) {
			System.out.println("Giá mỗi số điện là 1500, tiền điện là: " + ((100 * 1000) + (soDien - 100) * 1500));
		}
		sc.close();
	}

	public static void main(String[] args) {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ----------------------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất 			|");
		System.out.println("| 2. Giải phương trình bậc hai 			|");
		System.out.println("| 3. Tính số tiền điện 				|");
		System.out.println("| 4. Kết thúc 					|");
		System.out.println("++ ------------------ ++");
		System.out.println("Lựa chọn của bạn là: ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			bai1();
			break;
		case 2:
			System.out.println("Nhập số nguyên thứ nhất: ");
			int a = sc.nextInt();
			System.out.println("Nhập số nguyên thứ hai: ");
			int b = sc.nextInt();
			System.out.println("Nhập số nguyên thứ ba: ");
			int c = sc.nextInt();
			bai2(a, b, c);
			sc.close();
			break;
		case 3:
			bai3();
			break;
		default:
			System.out.println("Bạn đã thoát chương trình");
			System.exit(0);
			break;
		}
	}

}
