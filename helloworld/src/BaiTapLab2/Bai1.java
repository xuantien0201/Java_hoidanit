package BaiTapLab2;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
//		bai 1
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
}
