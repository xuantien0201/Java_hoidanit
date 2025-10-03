package BaiTapLab6;

import java.util.Scanner;

public class BaiTap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập username: ");
		String username = sc.nextLine();
		System.out.println("Nhập password: ");
		String password = sc.nextLine();
		if (username.equals("hoidanit") && (password.length() > 6)) {
			System.out.println("Hợp lệ");
		}
	}
}
