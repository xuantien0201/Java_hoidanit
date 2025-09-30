package hoidanit;

import java.util.Scanner;

public class If_else {
	public static void main(String[] args) {
		System.out.println("Nhập số tiền thu nhập: ");
		Scanner sc = new Scanner(System.in);
		float thue = sc.nextFloat();
		if(thue < 10000000) {
			System.out.println("Không cần đóng thuế");
		}else if(thue < 15000000) {
			System.out.println("Thuế 10%");
		}else if(thue < 30000000) {
			System.out.println("Thuế 20%");
		}else {
			System.out.println("Thuế 30%");
		}
		sc.close();
	}
}
