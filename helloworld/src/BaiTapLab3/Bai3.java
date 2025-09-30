package BaiTapLab3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào độ dài của mảng: ");
		int n = sc.nextInt();
		int[] list = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập phần tử thứ " + i + " : ");
			list[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			System.out.println("Phần tử thứ " + i + " trong mảng là " + list[i]);
		}
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (list[i] > list[j]) {
					int temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
			}
		}
		System.out.println("Sắp xếp các phần tử từ bé đến lớn: " + Arrays.toString(list));
		System.out.println(list[0]);
		System.out.println(list[n - 1]);
		int min = 0;
		int max = 0;
		for (int i = 0; i < n; i++) {
			if (list[i] < min) {
				min = list[i];
			}
		}
		System.out.println("Phần tử có giá trị nhỏ nhất là: " + min);
		for (int i = 0; i < n; i++) {
			if (list[i] > max) {
				max = list[i];
			}
		}
		System.out.println("Phần tử có giá trị lớn nhất là: " + max);
		sc.close();
	}
}
