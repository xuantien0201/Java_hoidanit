package BaiTapLab5;

import java.util.ArrayList;
import java.util.Scanner;

public class Chap5 {
	public static void main(String[] args) {
		ArrayList<Double> arr = new ArrayList<>();

		System.out.println("Nhập số lượng số thực ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double sum = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập số thực thứ " + i + " : ");
			double input = sc.nextDouble();
			arr.add(input);
			sum = sum + arr.get(i);
		}
		System.out.println("Danh sách số thực là: " + arr);
		System.out.println("Tổng của các số thực trong danh sách là: " + sum);
		sc.close();
	}
}
