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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "SinhVienIT [id=" + id + ", name=" + name + ", price=" + price + ", tax=" + tax + "]";
	}

}
