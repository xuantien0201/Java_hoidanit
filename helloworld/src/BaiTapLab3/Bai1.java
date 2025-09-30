package BaiTapLab3;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		System.out.println("Nhập số nguyên bất kỳ: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n <= 1) {
			System.out.println("Số " + n + " không là số nguyên tố");
			return;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				System.out.println("Số " + n + " không là số nguyên tố");
				return;
			}
		}
		System.out.println("Số " + n + " là số nguyên tố");
		sc.close();
	}
}
