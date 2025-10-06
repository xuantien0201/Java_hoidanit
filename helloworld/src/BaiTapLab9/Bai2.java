package BaiTapLab9;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Nhập vào điểm: ");
			try {
				int diem = sc.nextInt();
				if (diem > 0 && diem < 10) {
					System.out.println("Điểm là số thực");
				}
			} catch (Exception e) {
				// TODO: handle exception
				sc.next();
				System.out.println("Lỗi!! Điểm không phải số thực");
			}
		}
	}
}
