package BaiTapLab7;

public class SinhVienCoKhi extends SinhVien {
	private double scoreCNC;
	private double scorePLC;

	public SinhVienCoKhi(double scoreCNC, double scorePLC) {
		// TODO Auto-generated constructor stub
		this.scoreCNC = scoreCNC;
		this.scorePLC = scorePLC;
	}

	@Override
	public double tinhdiem() {
		// TODO Auto-generated method stub
		return (scoreCNC + scorePLC) / 2;
	}

}
