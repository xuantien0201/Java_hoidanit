package hoidanit;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
//		Bài 1
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Tên của bạn là: ");
//		String name = sc.nextLine();
//		System.out.println("Điểm trung bình của bạn là: ");
//		float dtb = sc.nextFloat();
//		System.out.println("Tên: " + name + " - " + "Có điểm trung bình là: " + dtb);
//		sc.close();
		
//		Bài 2
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Chiều dài hình chữ nhật là: ");
//		float cd = sc.nextFloat();
//		System.out.println("Chiều rộng hình chữ nhật là: ");
//		float cr = sc.nextFloat();
//		float chuvi = (cd + cr) * 2;
//		System.out.println("Chu vi hình chữ nhật là: " + chuvi);
//		float dientich = cd * cr;
//		System.out.println("Diện tích hình chữ nhật là: " + dientich);
//		float cmin = Math.min(cd,cr);
//		System.out.println("Cạnh nhỏ nhất là: " + cmin);
//		sc.close();
		
//		Bài 3
		Scanner sc = new Scanner(System.in);
		System.out.println("Cạnh của khối lập phương là: ");
		float canh = sc.nextFloat();
		
		double thetich = Math.pow(canh, 3);
		System.out.println("Thể tích của khối lập phương là: " + thetich);

		sc.close();
	}
}
