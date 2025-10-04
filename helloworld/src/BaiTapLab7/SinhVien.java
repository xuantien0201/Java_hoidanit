package BaiTapLab7;

public class SinhVien {
	int id;
	String name;
	double price;
	double tax;

	public double getPriceTax() {
		return price * tax;
	}

	public void info() {
		System.out.println("Run info method from parent");
	}

}
