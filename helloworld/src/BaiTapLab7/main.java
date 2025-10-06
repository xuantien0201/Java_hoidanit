package BaiTapLab7;

public class main {
	public static void main(String[] args) {
		SinhVienIT svit = new SinhVienIT(8, 10);
		System.out.println("check: " + svit.tinhdiem());

		SinhVienCoKhi svck = new SinhVienCoKhi(9, 9);
		System.out.println("check: " + svck.tinhdiem());
	}
}
