package BaiTapLab3;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		System.out.println("Nhập số nguyên bất kỳ: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Bảng cửu chương của số nguyên " + n + " là: ");
		for (int i = 1; i < 10; i++) {
			System.out.println(n + "*" + i + " = " + n * i);
		}
		sc.close();
	}
}
