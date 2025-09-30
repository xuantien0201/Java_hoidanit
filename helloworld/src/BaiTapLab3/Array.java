package BaiTapLab3;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
//		String[] clubs = { "ManUnited", "ManCity", "Liverpool" };
//		clubs[0] = "Asenal";
//		System.out.println(Arrays.toString(clubs));
//		System.out.println(clubs.length);
//		System.out.println("First element = " + clubs[0]);
//
//		for (int i = 0; i < clubs.length; i++) {
//			System.out.println(clubs[i]);
//		}

//		int[] number = { 5, 10, 24, 44, 1 };
//		System.out.println(number);
//		Arrays.sort(number);
//		System.out.println(Arrays.toString(number));

		int[] number = { 5, 10, 24, 44, 1 };

		// Vòng lặp ngoài: chọn từng phần tử trong mảng (ptu thứ 1)
		for (int i = 0; i < number.length - 1; i++) {

			// Vòng lặp trong: so sánh ptu thứ 1 với các ptu đứng sau nó (ptu thứ 2)
			for (int j = i + 1; j < number.length; j++) {

				// Nếu phần tử trước (number[i]) lớn hơn phần tử sau (number[j])
				// Đổi chiều thì giảm dần
				if (number[i] < number[j]) {

					// Đổi chỗ 2 phần tử này bằng biến trung gian
					int temp = number[i]; // Lưu tạm giá trị number[i]
					number[i] = number[j]; // Gán giá trị nhỏ hơn (number[j]) vào vị trí i
					number[j] = temp; // Gán giá trị ban đầu của number[i] vào vị trí j
				}
			}
		}

		// In ra mảng sau khi sắp xếp tăng dần
		System.out.println(Arrays.toString(number));
	}
}
