package BaiTapLab6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void main(String[] args) {
		// 0-9: ký tự đầu tiên là số từ 0 đến 9; 0: ký tự thứ hai là số 0; \d{11}: 11 ký
		// tự tiếp theo là số
		Pattern pattern = Pattern.compile("[A-Za-z0-9]{12}");
		Matcher matcher = pattern.matcher("035204000444");
		System.out.println("Input String matches regex - " + matcher.matches());

	}
}
