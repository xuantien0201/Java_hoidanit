package BaiTapLab4;

public class Bai1 {
	public static void main(String[] args) {
		Product pr1 = new Product();
		Product pr2 = pr1.nhapThongTin("ABC", 1000, 100);
		pr1.xuatThongTin(pr2);
		System.out.println("tax: " + pr1.getTaxPrice(pr1.getPrice(), pr1.getTax()));
	}
}
