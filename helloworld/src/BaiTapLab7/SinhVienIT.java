package BaiTapLab7;

public class SinhVienIT extends SinhVien {
	private double scoreJava;
	private double scoreHTML;

	public SinhVienIT(double scoreJava, double scoreHTML) {
		// TODO Auto-generated constructor stub
		this.scoreJava = scoreJava;
		this.scoreHTML = scoreHTML;
	}

	@Override
	public double tinhdiem() {
		return (scoreJava * 2 + scoreHTML) / 3;

	}
}