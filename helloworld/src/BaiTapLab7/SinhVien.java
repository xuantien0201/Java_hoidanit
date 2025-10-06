package BaiTapLab7;

public abstract class SinhVien {
	protected int id;
	protected String name;
	protected double price;
	protected double tax;

	abstract double tinhdiem();

	public SinhVien(int id, String name, double price, double tax) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public SinhVien() {

	}

	public double getPriceTax() {
		return price * tax;
	}

	public void info() {
		System.out.println("Run info method from parent");
	}

}
