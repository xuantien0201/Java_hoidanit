package BaiTapLab2;

import java.util.Scanner;

public class Bai2 {
	public static void giaiPTBac2(int a, int b, int c) {
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

	public static void main(String[] args) {
		System.out.println("Nhập số nguyên thứ nhất: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Nhập số nguyên thứ hai: ");
		int b = sc.nextInt();
		System.out.println("Nhập số nguyên thứ ba: ");
		int c = sc.nextInt();
		giaiPTBac2(a, b, c);
		sc.close();
	}
}
