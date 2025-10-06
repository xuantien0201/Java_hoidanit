package BaiTapLab9;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Nhập vào x: ");
			try {
				int x = sc.nextInt();
				try {
					System.out.println("Kết quả: " + 10 / x);
					break;
				} catch (Exception e) {
					System.out.println("Nhập x khác " + x);
				}
			} catch (Exception e) {
				sc.next();
				System.out.println("Error");
			}

		}
		sc.close();
	}
}
